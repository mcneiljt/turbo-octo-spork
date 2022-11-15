# turbo-octo-spork
Library which provides tools to aggregate multiple records into ORC files

# Technical Documentation

## Write JSON
Allows writing JSON records to the buffer

Target Version: 1.0.0

### Mapping from ORC to JSON

Below is a table providing the supported [ORC types](https://orc.apache.org/docs/core-java.html) and the [JSON Method](https://javadoc.io/doc/org.json/json/latest/index.html) used to retrieve the content.

| ORC Type | JSON Method   | Target Version |
|----------|---------------|----------------|
| string   | getString     | 1.0.0          |
| int      | getInt        | 1.0.0          | 
| double   | getDouble     | 1.0.0          |
| float    | getDouble     | 1.0.0          |
| boolean  | getBoolean    | 1.0.0          |
| Array    | getJSONArray  | 1.1.0          |
| Object   | getJSONObject | tbd            |
| decimal  | getBigDecimal | tbd            |
| bigint   | getBigInteger | tbd            |

## Write CSV
Allows writing CSV records to the buffer

Target Version: tbd