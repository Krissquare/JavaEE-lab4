DROP TABLE IF EXISTS `oomall_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oomall_product` (
                                  `id` bigint NOT NULL AUTO_INCREMENT,
                                  `goods_id` bigint NOT NULL,
                                  `product_sn` varchar(63) NOT NULL,
                                  `name` varchar(255) DEFAULT NULL,
                                  `original_price` int DEFAULT NULL,
                                  `weight` int DEFAULT NULL,
                                  `image_url` varchar(100) NOT NULL,
                                  `detail` varchar(255) NOT NULL,
                                  `state` tinyint NOT NULL DEFAULT '0',
                                  `disabled` tinyint NOT NULL DEFAULT '0',
                                  PRIMARY KEY (`id`),
                                  UNIQUE KEY `product_product_sn_uindex` (`product_sn`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `oomall_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oomall_goods` (
                                `id` bigint NOT NULL AUTO_INCREMENT,
                                `goods_sn` varchar(32) NOT NULL,
                                `name` varchar(128) NOT NULL,
                                `category_id` bigint DEFAULT NULL,
                                `brand_id` bigint DEFAULT NULL,
                                `image_url` varchar(200) DEFAULT NULL,
                                `disabled` tinyint DEFAULT '0',
                                `freight_id` varchar(32) NOT NULL,
                                `shop_id` varchar(32) NOT NULL,
                                `detail` varchar(255),
                                PRIMARY KEY (`id`),
                                UNIQUE KEY `oomall_goods_goods_sn_uindex` (`goods_sn`),
                                KEY `oomall_goods_name_index` (`name`),
                                KEY `oomall_goods_category_id_index` (`category_id`),
                                KEY `oomall_goods_brand_id_index` (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='商品';
/*!40101 SET character_set_client = @saved_cs_client */;