# springboot-dubbo-demo


### start a zookeeper container

Dubbo can use zookeeper as register center. Here start a zookeeper container by docker. As a demonstration, we use host net.

Run a zookeeper container:

```bash
docker run -d --name zookeeper --net host -it zookeeper
```

Stop the zookeeper container:

```bash
docker stop zookeeper
```

Start the stopped zookeeper container:

```bash
docker start zookeeper
```
