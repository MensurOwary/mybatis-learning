# Type Handlers

Type Handlers are means of converting data between the formats of Java and Database types (e.g enum to/from VARCHAR). 

## Below are the steps:

Implement `TypeHandler<ClassName>` class and its methods

```java
@MappedTypes(ClassName.class)
public class ClassNameHandler implements TypeHandler<ClassName> 
```

**setParameter** method sets the byte input of the ith element of the prepared statement

```java
public void setParameter(PreparedStatement preparedStatement, int i, ClassName param, JdbcType jdbcType);
```

**getResult** below converts the value in the column named with String s into the appropriate Class output

```java
public ClassName getResult(ResultSet resultSet, String s);
```

**getResult** below converts the value in the ith column into the appropriate Class output

```java
public ClassName getResult(ResultSet resultSet, int i);
```

**getResult** below converts the value in the ith value in callableStatement into appropriate Class output

```java
public Country getResult(CallableStatement callableStatement, int i);
```
