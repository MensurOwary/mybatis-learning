# Mapper XMLs

[MyBatis Mapper XML Files Documentation](http://www.mybatis.org/mybatis-3/sqlmap-xml.html)

In those files, we are writing the body parts of the methods in Mapper interfaces we have defined.

 - `<mapper></mapper>`
  
The entire code goes between `<mapper></mapper>` tag. It has an attribute of `namespace` which is pointing to the interface we have defined.

 - `<resultMap></resultMap>`
 
This tag marks the structure of the object of the result of the query. In `<result/>` marks a primitive field where `property` is the field in class, while `column` is the corresponding output. `<association>` depicts a complex object and we define a resultMap for that, nevertheless we can use already existing ones by this pattern - `[path to the Mapper].[resultMapsName in the Mapper.xml]`. `<collection>` is used to get collections of data.

 **Example:**
 
 In this example, Superhero is a Java class (we use its name, not path because we have already defined it in config.xml of MyBatis) 
 
 ```xml
<resultMap id="resultSuperhero" type="Superhero">
    <result property="id" column="id"/>
    <result property="name" column="name"/>
    <association property="city" javaType="City" resultMap="com.owary.mybatisexamples.mapper.CityMapper.resultCity"/>
    <collection property="superpowers" resultMap="com.owary.mybatisexamples.mapper.SuperpowerMapper.resultSuperpower" />
</resultMap>
```

 - select queries

 **Example:**
    
    As it seems, parameter passing is done using `#{property of object}` 

 ```xml
<select id="get" parameterType="java.lang.Long" resultMap="resultAlias">
    SELECT id, name FROM Alias
    WHERE id = #{id}
</select>
```

 - insert queries

 **Example:**

```xml
<insert id="insert" parameterType="City">
    INSERT INTO City(name, country) VALUES (#{name}, #{country});
</insert>
```
 **Example:**

 - We retrieve the next value in the sequence of the table for incrementing the id as pass it to the `id` property of the `Superhero` object. `order=BEFORE` means that the query in the `selectKey` tag will be executed first, it will be injected into the `id` property and then the insert will happen. However, if it was `order=AFTER`, the insertion would be prior to the obtaining of the `id`
 - A regular insertion is performed with the retrieved id from the selectKey operation.
 - The 3rd statement uses `foreach` construct as it is like forming a query string. What is basically does is that for each item in the collection, it appends its id to the last inserted id inside of parenthesis and separates all the parenthesis with comma separator.
 - Each query finishes with semi-colon

```xml
<insert id="insert" parameterType="Superhero" >
    <selectKey keyProperty="id" resultType="Long" order="BEFORE">
        SELECT NEXTVAL('superhero_id_seq') id;
    </selectKey>

    INSERT INTO Superhero (id, name,height,weight,city_id)
    VALUES (#{id}, #{name}, #{height}, #{weight}, #{city.id});

    INSERT INTO SuperheroSuperpower (superhero_id, superpower_id) VALUES
    <foreach item="power" collection="superpowers" separator=",">
        (#{id}, #{power.id})
    </foreach>;
</insert>
```

**Delete and Update goes the same way as well**
