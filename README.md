# SpringDataJPAExample_MySQL


## Spring Data JPA

- Spring Data JPAは、Java Persistence API (JPA)の上に構築されており、ORM（オブジェクト関係マッピング）をサポートします。
- ORMは、Javaオブジェクトとデータベーステーブルの間のマッピングを自動化します。


### 特徴:

- 複雑なマッピング:
 - エンティティ間の複雑なリレーション（1対多、多対多など）をサポートし、アノテーションを使用してマッピングを簡単に設定できます。

- キャッシュ:
二次キャッシュのサポートがあり、パフォーマンスを向上させるためにキャッシング機構を使用できます。

- クエリ言語:
JPQL（Java Persistence Query Language）やネイティブSQLを使用して複雑なクエリを記述できます。

- 自動生成クエリ:
メソッド名に基づいてクエリを自動生成する機能があり、リポジトリインターフェースに簡単にカスタムクエリを追加できます。

- トランザクション管理:
トランザクションの管理が容易であり、@Transactionalアノテーションを使用してトランザクション境界を定義できます。


## Example

- MySQL

```
mysql> CREATE DATABASE `TestDB`;
mysql > use TestB;
mysql> CREATE TABLE `Employee` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20) DEFAULT NULL,
    `role` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
mysql> insert into `Employee` (
  `name` ,
  `role` 
) values ("アリス", "社長"), ("スーパー", "部長");
```

- pom.xml

```
<!-- add -->		
<dependency>
      <groupId>jakarta.persistence</groupId>
      <artifactId>jakarta.persistence-api</artifactId>
</dependency>
<!-- add end -->	
```
