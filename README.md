# pihole-api

## Setup
To use <code>pihole-api</code> in your Java project, simply add the following dependency to your projects build file:

### Maven: pom.xml
```
<dependency>
    <groupId>com.github.tobiasmiosczka</groupId>
    <artifactId>pihole-api</artifactId>
    <version>main-SNAPSHOT</version>
</dependency>
```
### Gradle: build.gradle
```
dependencies {
    implementation 'com.github.tobiasmiosczka:pihole-api:main-SNAPSHOT'
}
```

Usage
-
<code>pihole-api</code> is quite simple to use. App you need is the URL to your PiHole server and the api key from your
service:
```
PiHoleApi piHoleApi = PiHoleApi.builder()
    .withHost("pi.hole")
    .withApiKey("some-api-key")
    .build();
```

<code>pihole-api</code> provides an easy builder pattern like api to fetch data:
```
LocalDateTime now = LocalDateTime.now();
//asynchronous api call
CompletableFuture<QueryLogResponse> async = piHoleApi.longTermData()
    .queryLog(now.minusDays(1), now)
    .withStatus(Set.of(QueryStatus.OK))
    .async();
QueryLogResponse queryLogResponse = async.get();
```

Data can also be fetched with a synchronous call:
```
LocalDateTime now = LocalDateTime.now();
//synchronous api call
TopClientsResponse topClientsResponse = piHoleApi.longTermData()
    .topClients(now.minusDays(1), now)
    .execute(10, TimeUnit.SECONDS);
```