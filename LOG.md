# 开发日志

> 每天一条：做了什么、踩了什么坑。最新在最上面。

---

## Day2 · 2026-11-25

**目标**：让数据从数据库里来

- 装好 MySQL，建库 `hakoniwa`、建表 `work`
- 配置 `application.yml` 连数据库
- 加 MyBatis 依赖
- 写实体类 `Work`
- 写 `WorkMapper`（`@Mapper` + `@Select`）
- 写 `WorkController`，构造器注入 Mapper
- 验证：`GET /api/works` 返回 3 条数据

**踩的坑**

- MySQL 服务"假运行"，端口没监听 → 重启服务
- git 连不上 GitHub → 浏览器有代理、git 没走 → 配 `http.proxy`

---

## Day1 · 2026-11-24

**目标**：项目能跑起来

- 建 Maven 项目（Spring Boot 3.4.1 + Java 17）
- 写启动类 `HakoniwaApplication`
- 写第一个接口 `GET /hello`，返回 JSON
- 验证：浏览器看到 `{"message":"Hello Hakoniwa",...}`

**踩的坑**

- pom.xml 里 `<dependency>` 写到 `<dependencies>` 外面 → Maven 忽略
- 启动类的包位置决定扫描范围