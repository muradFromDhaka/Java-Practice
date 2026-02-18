/*
SQLyog Community v13.3.0 (64 bit)
MySQL - 8.0.41 : Database - final_project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`final_project` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `final_project`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  `user_user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi9kvsde7uw31ihsp4k0pk2q68` (`user_user_name`),
  CONSTRAINT `FKi9kvsde7uw31ihsp4k0pk2q68` FOREIGN KEY (`user_user_name`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `address` */

/*Table structure for table `brands` */

DROP TABLE IF EXISTS `brands`;

CREATE TABLE `brands` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `logo_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `brands` */

insert  into `brands`(`id`,`description`,`logo_url`,`name`) values 
(1,'Bright, colorful, and fun clothing that matches the energy of kids. Ideal for playful days and happy adventures.','uploadDir/a8a6bd05-988e-4565-81bb-71b2c1032fdf-images (27).jpg','Rainbow Rascals'),
(2,'Durable, fun, and colorful clothing designed for playtime, adventure, and endless fun.','uploadDir/e606a974-7cb0-4677-9355-3a43209d2a22-images (28).jpg','PlayPal Fashion'),
(3,'Trendy streetwear inspired by urban culture. Bold prints, cool graphics, and edgy style.','uploadDir/dd85e56e-e143-4a66-bbb7-36202ec983df-images (29).jpg','Street Pulse'),
(4,' Modern, urban, and edgy style. Streetwear and casual wear with a unique twist.','uploadDir/51457f58-74a0-4f4e-b933-7068933984d3-store_6_7fb6c544-a860-4e69-a348-649d2af82b1d.webp','Eclipse Wear');

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `total_amount` decimal(38,2) DEFAULT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh343oc2v1f4vs0i3w3r28ou7f` (`user_name`),
  CONSTRAINT `FKh343oc2v1f4vs0i3w3r28ou7f` FOREIGN KEY (`user_name`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `cart` */

insert  into `cart`(`id`,`created_at`,`deleted`,`updated_at`,`total_amount`,`user_name`) values 
(1,'2026-01-03 15:26:29.179419','\0','2026-01-04 12:28:59.083720',60714.00,'murad'),
(2,'2026-01-03 15:52:09.866716','\0','2026-01-03 15:52:09.866716',0.00,'Hasan'),
(3,'2026-01-03 18:01:19.426677','\0','2026-01-04 15:07:21.718214',37936.00,'Robin'),
(4,'2026-01-03 18:18:00.612096','\0','2026-01-04 12:55:12.783530',23000.00,'Abdullah'),
(5,'2026-01-03 18:27:40.114208','\0','2026-01-03 18:27:40.114208',0.00,'Ismam'),
(6,'2026-01-04 12:49:55.085438','\0','2026-01-04 12:59:06.622433',17000.00,'Kayes'),
(7,'2026-01-04 13:05:28.778280','\0','2026-01-04 18:06:14.699387',36000.00,'zia'),
(8,'2026-01-04 15:25:19.294544','\0','2026-01-04 15:25:19.294544',0.00,'Nahid');

/*Table structure for table `cart_item` */

DROP TABLE IF EXISTS `cart_item`;

CREATE TABLE `cart_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `price` decimal(10,2) NOT NULL,
  `quantity` int NOT NULL,
  `total_price` decimal(10,2) NOT NULL,
  `cart_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1uobyhgl1wvgt1jpccia8xxs3` (`cart_id`),
  KEY `FKqkqmvkmbtiaqn2nfqf25ymfs2` (`product_id`),
  CONSTRAINT `FK1uobyhgl1wvgt1jpccia8xxs3` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`id`),
  CONSTRAINT `FKqkqmvkmbtiaqn2nfqf25ymfs2` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `cart_item` */

insert  into `cart_item`(`id`,`created_at`,`deleted`,`updated_at`,`price`,`quantity`,`total_price`,`cart_id`,`product_id`) values 
(1,'2026-01-03 18:25:37.984705','\0','2026-01-03 18:25:37.984705',6000.00,1,6000.00,1,5),
(2,'2026-01-03 18:25:51.935186','\0','2026-01-03 18:25:51.935186',7000.00,1,7000.00,1,6),
(3,'2026-01-04 12:28:55.016842','\0','2026-01-04 12:28:59.084734',565.00,4,2260.00,1,9),
(4,'2026-01-04 12:28:56.479681','\0','2026-01-04 12:28:56.479681',45454.00,1,45454.00,1,8),
(12,'2026-01-04 12:55:09.621244','\0','2026-01-04 12:55:09.621244',6000.00,1,6000.00,4,5),
(13,'2026-01-04 12:55:11.346814','\0','2026-01-04 12:55:11.346814',7000.00,1,7000.00,4,6),
(14,'2026-01-04 12:55:12.779447','\0','2026-01-04 12:55:12.779447',10000.00,1,10000.00,4,7),
(15,'2026-01-04 12:59:03.538293','\0','2026-01-04 12:59:03.538293',7000.00,1,7000.00,6,6),
(16,'2026-01-04 12:59:06.618515','\0','2026-01-04 12:59:06.618515',10000.00,1,10000.00,6,7),
(19,'2026-01-04 13:10:07.971621','\0','2026-01-04 15:07:21.719211',7000.00,4,28000.00,3,6),
(23,'2026-01-04 13:18:12.802685','\0','2026-01-04 13:19:51.422258',434.00,2,868.00,3,11),
(26,'2026-01-04 13:43:34.807085','\0','2026-01-04 13:49:03.179144',4534.00,2,9068.00,3,13),
(44,'2026-01-04 18:06:04.850510','\0','2026-01-04 18:06:04.850510',10000.00,1,10000.00,7,7),
(45,'2026-01-04 18:06:05.415157','\0','2026-01-04 18:06:14.700384',7000.00,2,14000.00,7,6),
(46,'2026-01-04 18:06:06.063061','\0','2026-01-04 18:06:14.212801',6000.00,2,12000.00,7,5);

/*Table structure for table `categories` */

DROP TABLE IF EXISTS `categories`;

CREATE TABLE `categories` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `parent_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsaok720gsu4u2wrgbk10b5n8d` (`parent_id`),
  CONSTRAINT `FKsaok720gsu4u2wrgbk10b5n8d` FOREIGN KEY (`parent_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `categories` */

insert  into `categories`(`id`,`created_at`,`deleted`,`updated_at`,`image_url`,`name`,`parent_id`) values 
(1,'2026-01-03 15:53:47.699999','\0','2026-01-03 15:53:47.699999','uploadDir/117b6205-90f0-460d-b51b-3d74842134da-images (1).jpg','Fashion',NULL),
(2,'2026-01-03 15:55:16.418843','\0','2026-01-03 15:55:16.419839','uploadDir/9aebb76b-3d16-483e-bd47-0634d07e0a23-images (4).jpg','Electronics',NULL),
(3,'2026-01-03 15:58:06.462110','\0','2026-01-03 15:58:06.462110','uploadDir/5694c812-a260-4623-9094-86555459d12d-istockphoto-1553783224-612x612.jpg','Grocery',NULL),
(4,'2026-01-03 16:00:24.576928','\0','2026-01-03 16:00:24.576928','uploadDir/fabde9a0-3b8e-4c6f-951b-36ba224e8878-depositphotos_58785613-stock-photo-winter-beauty-model-girl.jpg','Beauty',NULL),
(5,'2026-01-03 16:01:49.625547','\0','2026-01-03 16:01:49.625547','uploadDir/c196b400-45a3-4c02-9e4f-8a3744ab2a12-images (5).jpg','Books',NULL),
(6,'2026-01-03 16:03:13.280373','\0','2026-01-03 16:03:13.280373','uploadDir/c0aad9d5-9018-418f-935f-2f43feec2542-istockphoto-637332860-612x612.jpg','Sports',NULL),
(7,'2026-01-03 16:05:05.812737','\0','2026-01-03 16:05:05.812737','uploadDir/bd4ebe7f-9443-4388-a1b2-346ebad16bc6-Refurbished_Mobile_Phones_1.webp','Mobile',2),
(8,'2026-01-03 16:12:32.409715','\0','2026-01-03 18:24:15.769929','uploadDir/22bfa808-d3b6-4066-91a3-96dae2fedd5e-images (6).jpg','Women’s Fashion',1),
(9,'2026-01-03 16:16:11.050463','\0','2026-01-03 16:31:04.742957','uploadDir/8cf892d2-6e21-4041-a794-b53334965e3e-paris-fashion-week-mens-street-style-fall-2019.jpg','Man\'s Fasion',1),
(10,'2026-01-03 17:00:05.983772','\0','2026-01-03 17:00:05.983772','uploadDir/7a27bf72-aabe-4f7f-b0ce-decc723a3b6d-images (7).jpg','Kids Fashion',1);

/*Table structure for table `deals` */

DROP TABLE IF EXISTS `deals`;

CREATE TABLE `deals` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `discount_percent` int NOT NULL,
  `end_time` datetime(6) NOT NULL,
  `start_time` datetime(6) NOT NULL,
  `title` varchar(150) NOT NULL,
  `product_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdiyxm7qwacnjy62mr34jn35p6` (`product_id`),
  CONSTRAINT `FKdiyxm7qwacnjy62mr34jn35p6` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `deals` */

/*Table structure for table `inventory` */

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `available_quantity` int DEFAULT NULL,
  `reserved_quantity` int DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKce3rbi3bfstbvvyne34c1dvyv` (`product_id`),
  CONSTRAINT `FKq2yge7ebtfuvwufr6lwfwqy9l` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `inventory` */

/*Table structure for table `order_items` */

DROP TABLE IF EXISTS `order_items`;

CREATE TABLE `order_items` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `quantity` int NOT NULL,
  `unit_price` decimal(10,2) NOT NULL,
  `order_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  `vendor_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbioxgbv59vetrxe0ejfubep1w` (`order_id`),
  KEY `FKocimc7dtr037rh4ls4l95nlfi` (`product_id`),
  KEY `FKh2b04eyamwe2jqedwv3lbrx7f` (`vendor_id`),
  CONSTRAINT `FKbioxgbv59vetrxe0ejfubep1w` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `FKh2b04eyamwe2jqedwv3lbrx7f` FOREIGN KEY (`vendor_id`) REFERENCES `vendors` (`id`),
  CONSTRAINT `FKocimc7dtr037rh4ls4l95nlfi` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `order_items` */

insert  into `order_items`(`id`,`created_at`,`deleted`,`updated_at`,`quantity`,`unit_price`,`order_id`,`product_id`,`vendor_id`) values 
(1,'2026-01-04 12:50:18.203724','\0','2026-01-04 12:50:18.203724',1,45454.00,1,8,1),
(2,'2026-01-04 13:11:47.521888','\0','2026-01-04 13:11:47.521888',1,43.00,11,10,1),
(3,'2026-01-04 13:42:34.392619','\0','2026-01-04 13:42:34.392619',1,4534.00,14,13,1),
(4,'2026-01-04 15:04:41.837061','\0','2026-01-04 15:04:41.837061',1,5454.00,18,34,1),
(5,'2026-01-04 15:06:11.604940','\0','2026-01-04 15:06:11.604940',1,500.00,19,16,1),
(6,'2026-01-04 15:06:28.489098','\0','2026-01-04 15:06:28.489098',1,450.00,20,14,2),
(7,'2026-01-04 15:07:45.876151','\0','2026-01-04 15:07:45.876151',1,3450.00,21,29,1),
(8,'2026-01-04 15:08:04.931609','\0','2026-01-04 15:08:04.931609',1,500.00,22,25,1),
(9,'2026-01-04 15:36:55.361823','\0','2026-01-04 15:36:55.361823',1,454.00,23,37,3),
(10,'2026-01-04 15:51:17.259819','\0','2026-01-04 15:51:17.259819',1,350.00,24,15,2),
(11,'2026-01-04 16:56:32.290503','\0','2026-01-04 16:56:32.290503',2,500.00,25,16,1),
(12,'2026-01-04 16:56:32.293494','\0','2026-01-04 16:56:32.293494',2,500.00,25,17,2),
(13,'2026-01-04 16:56:32.295489','\0','2026-01-04 16:56:32.295489',2,350.00,25,15,2),
(14,'2026-01-04 18:04:58.979526','\0','2026-01-04 18:04:58.979526',1,500.00,27,17,2),
(15,'2026-01-04 18:04:58.981537','\0','2026-01-04 18:04:58.981537',1,500.00,27,16,1);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `order_status` enum('CANCELLED','DELIVERED','PAID','PENDING','SHIPPED') NOT NULL,
  `total_price` decimal(12,2) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKel9kyl84ego2otj2accfd8mr7` (`user_id`),
  CONSTRAINT `FKel9kyl84ego2otj2accfd8mr7` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `orders` */

insert  into `orders`(`id`,`created_at`,`deleted`,`updated_at`,`order_status`,`total_price`,`user_id`) values 
(1,'2026-01-04 12:50:18.203724','\0','2026-01-04 12:50:18.203724','PENDING',45454.00,'Kayes'),
(11,'2026-01-04 13:11:47.521888','\0','2026-01-04 13:11:47.521888','PENDING',43.00,'zia'),
(14,'2026-01-04 13:42:34.391616','\0','2026-01-04 13:42:34.391616','PENDING',4534.00,'zia'),
(18,'2026-01-04 15:04:41.835052','\0','2026-01-04 15:04:41.835052','PENDING',5454.00,'zia'),
(19,'2026-01-04 15:06:11.603943','\0','2026-01-04 15:06:11.603943','PENDING',500.00,'zia'),
(20,'2026-01-04 15:06:28.487090','\0','2026-01-04 15:06:28.487090','PENDING',450.00,'zia'),
(21,'2026-01-04 15:07:45.874143','\0','2026-01-04 15:07:45.874143','PENDING',3450.00,'zia'),
(22,'2026-01-04 15:08:04.928616','\0','2026-01-04 15:08:04.929616','PENDING',500.00,'zia'),
(23,'2026-01-04 15:36:55.361823','\0','2026-01-04 15:36:55.361823','PENDING',454.00,'zia'),
(24,'2026-01-04 15:51:17.257824','\0','2026-01-04 15:51:17.257824','PENDING',350.00,'zia'),
(25,'2026-01-04 16:56:32.288507','\0','2026-01-04 16:56:32.288507','PENDING',2700.00,'zia'),
(27,'2026-01-04 18:04:58.977516','\0','2026-01-04 18:04:58.977516','PENDING',1000.00,'zia');

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `provider` varchar(255) DEFAULT NULL,
  `status` enum('FAILED','INITIATED','SUCCESS') DEFAULT NULL,
  `transaction_id` varchar(255) DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKmf7n8wo2rwrxsd6f3t9ub2mep` (`order_id`),
  CONSTRAINT `FKlouu98csyullos9k25tbpk4va` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `payment` */

/*Table structure for table `product_images` */

DROP TABLE IF EXISTS `product_images`;

CREATE TABLE `product_images` (
  `product_id` bigint NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  KEY `FKqnq71xsohugpqwf3c9gxmsuy` (`product_id`),
  CONSTRAINT `FKqnq71xsohugpqwf3c9gxmsuy` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `product_images` */

insert  into `product_images`(`product_id`,`image_url`) values 
(1,'uploadDir/02625c0f-e3f8-4403-9b85-5c1add273437-fashion-product-mix-pyramid.webp'),
(1,'uploadDir/514dfdda-719b-4ab1-9d6f-aacb57869cc0-images (1).jpg'),
(1,'uploadDir/482acf5b-6d21-45fa-86b6-94ca2ac71169-images (2).jpg'),
(1,'uploadDir/b74322ce-775e-488c-add8-e4e37d3e1a47-images (3).jpg'),
(5,'uploadDir/a6e045f0-373f-4ad2-81bf-fb672553d902-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80.jpg'),
(5,'uploadDir/654f1567-a9ab-4df0-8500-8c1c8476c231-images (32).jpg'),
(5,'uploadDir/7ecebadb-8fa9-41d2-86f4-e45c798f67cc-images (33).jpg'),
(5,'uploadDir/4530fea0-1511-4017-809a-8456df37e652-images (34).jpg'),
(6,'uploadDir/04afe3ff-5f20-4354-a938-4f92f0d3ccc4-images (35).jpg'),
(6,'uploadDir/6d94f7cc-2e81-4e10-bf5a-2068fbe05748-images (36).jpg'),
(6,'uploadDir/7413ca8a-8676-4bf2-9960-e477241ad61a-images (37).jpg'),
(6,'uploadDir/3696ae6e-bb9f-4e88-bc4e-601ccf00b660-images (38).jpg'),
(6,'uploadDir/31245322-d6a2-4d2c-b043-245aa453fc85-images (39).jpg'),
(7,'uploadDir/371b422b-487d-4346-b56a-da37b862e83f-images (31).jpg'),
(7,'uploadDir/bbc9d88e-08fc-46b4-80db-9d93d8bd434d-images (40).jpg'),
(7,'uploadDir/f7ea26d4-dbee-4872-bd46-e2d88b9a15e3-images (41).jpg'),
(7,'uploadDir/bc22df40-d941-41a6-b9b5-09897a75ee79-images (42).jpg'),
(8,'uploadDir/4ffb50d8-9839-417a-b2d7-a5b1907a301b-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80 - Copy.jpg'),
(8,'uploadDir/cdeed1de-5623-4ef1-88f1-c66793c605e2-images (21) - Copy.jpg'),
(8,'uploadDir/cc4d6f59-752c-4a3a-a441-fcd077e2788b-images (21).jpg'),
(8,'uploadDir/a43e29dd-a188-4a05-95e5-4768e60b060d-images (22) - Copy.jpg'),
(9,'uploadDir/44b9af94-b332-4324-8d16-27ad516c541f-3Y2A0258-Edit-scaled.webp'),
(10,'uploadDir/6f61178e-73fa-4e6f-841a-64e5bfc5748d-92a093a5-e226-4c5f-9829-96c717e9bbba.webp'),
(10,'uploadDir/ec4d554d-da44-4c56-bf06-a4202fac3661-161705126_461250888451465_3077274894655803242_n.jpg'),
(11,'uploadDir/250e4437-cac0-4fd7-a0da-80870767fe40-DSC05811_84fef8b0-6497-4ac5-ac9a-35669a464b4e_540x.webp'),
(11,'uploadDir/5d7a58f7-0094-4a12-aa3c-c36aba1af496-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80.jpg'),
(11,'uploadDir/f58bd9be-9145-4abe-a30c-4a4dfe70fdae-DSC09594_59315fe9-348b-4306-80c6-0a7260c52cf7_540x.webp'),
(11,'uploadDir/c47ca907-8f9e-483d-b199-54ce73dfc8fe-DSC09606_c497879b-312d-48bd-a2db-624e8b9f0a17_540x.webp'),
(12,'uploadDir/3b3dff5c-26b0-4b50-92b4-ea6bfa21de7b-3Y2A0258-Edit-scaled.webp'),
(13,'uploadDir/5626d100-3424-4bef-b7f0-d51cf4b54569-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80 - Copy.jpg'),
(13,'uploadDir/8246239e-4909-4500-ba32-9fbf2506b6b2-depositphotos_58785613-stock-photo-winter-beauty-model-girl.jpg'),
(14,'uploadDir/11d3cf41-de7b-45a3-9f76-3b9b84228c2f-20175031a.webp'),
(14,'uploadDir/a14b3c1e-a0b4-4e43-a441-ad107c32d4c8-20465597a.webp'),
(14,'uploadDir/bdf5eb59-1269-4ad3-b708-df141f0231dc-20959917a.webp'),
(14,'uploadDir/ab4c63c5-a271-4c35-98e3-5088c51198a3-20959922a.webp'),
(15,'uploadDir/2502b2fe-0e76-461f-ae6f-493e78896039-20959899a.webp'),
(15,'uploadDir/91cfc8bf-530a-4dad-b0a6-b1939646c311-20959909a.webp'),
(15,'uploadDir/8c2709a4-aafa-45ed-824a-1668b4c5a830-20959917a.webp'),
(15,'uploadDir/8c84e387-e8b5-40f1-af65-aebe5b5dc5ef-20959922a.webp'),
(15,'uploadDir/3ee95406-4711-4446-ba38-900d59a39100-21421682a.webp'),
(16,'uploadDir/611b7f72-898c-4f7a-8b00-bf3d3c167822-3Y2A0258-Edit-scaled.webp'),
(16,'uploadDir/f4eaf99f-220b-47d0-abed-b9948cdcfd35-19242487a.webp'),
(16,'uploadDir/80409986-d006-4d5e-9ddf-b4a5e5b5fba4-AN63787_2.webp'),
(16,'uploadDir/e520d95c-7441-440c-8c9a-a924a0507d63-DSC07279_575c0ea8-a548-41dd-9dbe-34cb741a1751_540x.webp'),
(17,'uploadDir/523b3c70-e767-47bf-b0d8-6be6592d70fa-3Y2A0258-Edit-scaled.webp'),
(17,'uploadDir/805ece18-7a0a-4d3c-b885-f2a310b1dc84-41RMO5xCklL._AC_UY1100_.jpg'),
(17,'uploadDir/21e7c6ec-672f-400d-b52f-a317e61c91a6-18287054a.webp'),
(17,'uploadDir/5ec75946-95e8-4fcc-b25f-68611ddb3074-blue-casual-wear-comfortable-washable-denim-kids-jeans-with-belt--168.jpg'),
(18,'uploadDir/bf4a4595-067d-4847-8439-5f2f22a9d4ec-41RMO5xCklL._AC_UY1100_.jpg'),
(18,'uploadDir/8b0af52d-345a-41ec-baa6-9b394d59447d-images (49).jpg'),
(18,'uploadDir/04748bf7-8c2d-4f10-adde-8ea276ca0a57-images (50).jpg'),
(18,'uploadDir/854e0989-30e2-4789-9c20-0e4672667797-images (51).jpg'),
(18,'uploadDir/d8f35efc-19dc-4868-8eeb-60eab5a558b8-ss228372_Small.webp'),
(19,'uploadDir/afe23f81-07b8-4b7b-a2a0-fec1264271cd-$_12 (1).jpg'),
(19,'uploadDir/cd366ad5-6be3-46ad-beed-9df8795d8770-$_12.jpg'),
(19,'uploadDir/acc7809b-5490-475e-ac2a-14fc24f0a95d-18287054a.webp'),
(19,'uploadDir/29313502-77e4-48c7-a5e7-23a2406cf6b4-20959917a.webp'),
(19,'uploadDir/a49fef92-7748-4627-b9dc-e9a949d8de08-20959922a.webp'),
(22,'uploadDir/77acc72c-9ee7-499f-b46b-9128d01b2b22-c0143864e92f4c9cbd56afb68541d996.webp'),
(22,'uploadDir/6e50f695-9079-40a3-b7d8-07bf2f1aaec6-DSC00098_110600bf-4ea6-4f76-bb67-47f278eef003_540x.webp'),
(22,'uploadDir/b424d3ee-c1e3-48e7-b309-8cb8c0034a7c-DSC00632_540x.webp'),
(22,'uploadDir/1e9d70b6-9920-4aad-9192-50f9b365b889-DSC07279_575c0ea8-a548-41dd-9dbe-34cb741a1751_540x.webp'),
(23,'uploadDir/ae1ae953-4388-4597-adc3-e4b7990fd8b6-006388947 (1).webp'),
(23,'uploadDir/3d733c4b-3914-48e4-a193-f618767b081e-images (66).jpg'),
(23,'uploadDir/4f964b64-5da0-48b6-96db-78ef8ca9980b-images (70).jpg'),
(23,'uploadDir/d9afe90a-cca7-4801-97ef-742b921e3c8e-images (71).jpg'),
(23,'uploadDir/fdb3ea82-18e0-4e03-a854-f6ae7421d52f-images (72).jpg'),
(23,'uploadDir/5027578d-f39b-4098-ac9d-876ab22efc69-images (73).jpg'),
(24,'uploadDir/cab7847f-52f1-4644-808b-cfb6a57c022e-8fe191a30f9c48c634dada019906b1a6.jpg_720x720q80.jpg'),
(24,'uploadDir/13de0bbb-629c-496f-8eb9-60c9090b21be-92a093a5-e226-4c5f-9829-96c717e9bbba.webp'),
(24,'uploadDir/976dc72d-7df8-4fed-9fba-278c89d7036a-2024-New-4-12-Year-Old-Robe-Princess-Dress-Flower-Girl-Wedding-Dress-Fashionable-Party-Dress-Lace-Mesh-Elegant-Girls-Clothing-Sarah-Houston-2860.webp'),
(25,'uploadDir/878a305e-cb43-4853-bfb8-a0c163d6f617-Fashion-Formal-Sleeveless-Embroidery-Flower-Bow-Children-Kids-Birthday-Evening-Wedding-Party-Dresses-for-Girls.avif'),
(25,'uploadDir/741e2197-8c0d-4345-8ac3-89494db933ea-Girls-Children-s-Wedding-Elegant-Flower-Princess-Long-Dress-Girl-Front-Court-Baby-Size-6-12-14-Years-Old.jpg_300x300.avif'),
(25,'uploadDir/986f75a1-c25a-4b36-a627-d9c6cbec733b-haGiVwrrwL8Z3xbTuMUdsKVbbAQtlPCvQs88rZOk.png'),
(25,'uploadDir/523fbb60-c649-46a3-871b-8bf728f0ac23-images (12).jpg'),
(26,'uploadDir/9d65af54-a360-4b40-a2e4-beb086c989ec-Fashion-Formal-Sleeveless-Embroidery-Flower-Bow-Children-Kids-Birthday-Evening-Wedding-Party-Dresses-for-Girls.avif'),
(26,'uploadDir/c1b59a5c-afe0-414c-ba42-142a82abcb6b-haGiVwrrwL8Z3xbTuMUdsKVbbAQtlPCvQs88rZOk.png'),
(26,'uploadDir/1f194890-21c0-474f-8293-5805b69c6923-images (9).jpg'),
(26,'uploadDir/68a9e26b-7cb7-47ed-b788-ee044d57e2e8-images (10).jpg'),
(26,'uploadDir/e1fd15dd-a045-4e9c-a6cc-707d15524c43-images (15).jpg'),
(27,'uploadDir/1aa97561-a5f3-4ac5-8c3f-0414e3ebb981-images (84).jpg'),
(27,'uploadDir/8861079b-c0f4-472e-8ce7-de6c7194cf7b-images (85).jpg'),
(27,'uploadDir/ca5fe202-de68-4f28-9a67-c09150ad6b43-images (87).jpg'),
(27,'uploadDir/491da88b-9192-4dd3-938a-9f1a91020ce6-images (88).jpg'),
(28,'uploadDir/9f5b3f14-848f-4dd4-91e5-147904057a71-images (86).jpg'),
(28,'uploadDir/c0044580-ea4c-4a1f-860a-d3eec6ef2e59-images (87).jpg'),
(28,'uploadDir/8644ac1b-361f-4748-8d6f-2e588d2a3512-images (88).jpg'),
(29,'uploadDir/bee811b0-2799-4dad-a520-235a7b216b3f-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80 - Copy.jpg'),
(29,'uploadDir/e89ace7b-5ee5-472f-8769-4a5820797156-db60ff79582c3ffd536644d1e2175302.jpg_720x720q80.jpg'),
(29,'uploadDir/6546bb72-af9c-4810-b67a-1e1de17e64a5-DSC7715.webp'),
(30,'uploadDir/91593dcb-55b9-4dd5-849f-9f375612f5be-images (32).jpg'),
(30,'uploadDir/74a94d0c-515a-4e56-8b3d-a7e8559f1992-images (33).jpg'),
(30,'uploadDir/b20c422c-c4af-4141-8a17-4890e77a7041-images (34).jpg'),
(30,'uploadDir/611611f2-fdd1-4833-a029-98bd1177a064-images (35).jpg'),
(31,'uploadDir/8226d3fe-5744-412b-ae57-a73e8a333395-images (36).jpg'),
(31,'uploadDir/1de106cf-ac2a-4d21-8e7e-9c3fa745f9cd-images (37).jpg'),
(31,'uploadDir/70b3bc81-b72f-45b6-a841-c7a9f2bcd2a2-images (38).jpg'),
(31,'uploadDir/7444476c-ac9a-4fd2-8c5d-8cf3c7430ac1-images (39).jpg'),
(32,'uploadDir/8703dcf2-6e8d-4044-8ed8-7706c76e2610-images (40).jpg'),
(32,'uploadDir/c3f7d489-a4e1-4623-9887-3242400af76c-images (41).jpg'),
(32,'uploadDir/beeaa82b-11d9-472f-ab48-97d3735e02ec-images (42).jpg'),
(33,'uploadDir/3f7e9b04-6a97-4dc4-a6c0-809b03f8e971-images (35).jpg'),
(33,'uploadDir/fd9c792e-9158-43ed-8a5e-6fbe6a323b26-images (41).jpg'),
(33,'uploadDir/992328a4-b506-4e61-9a87-42f8856b6684-images (42).jpg'),
(34,'uploadDir/def9463e-73b9-47ad-929c-eb7344438f38-41RMO5xCklL._AC_UY1100_.jpg'),
(34,'uploadDir/6e5d3da0-6853-4c70-b145-35b955d59005-44d1d06eb9a0cab9ce10967a4dc4fe8a.jpg'),
(35,'uploadDir/f3331dd5-d908-4829-bf6e-6edb980b3f67-images (89).jpg'),
(35,'uploadDir/5bf405b2-fb3d-48c1-b0c7-e03cc645631d-images (90).jpg'),
(35,'uploadDir/b712ace6-8f98-4764-9cba-4edfd95e36f2-shirt-1paoper-white.jpg'),
(36,'uploadDir/32e3bb5e-ebf9-4f00-a443-5be1ae9e63b2-images (91).jpg'),
(36,'uploadDir/66ff2797-5a2c-418b-be94-181d954e77c5-images (92).jpg'),
(36,'uploadDir/53a0cc8e-78a0-4ed4-a773-c25c00ee7d09-SB-PANB-TM24-06A-55667_3.webp'),
(37,'uploadDir/97f29fa1-f6a6-4d61-9d5e-88bf03df3d8d-DSC9357_540x.webp'),
(37,'uploadDir/aa9c3032-9f1d-478f-9c8c-e1c96bc04268-DSC09594_0dbb080f-df1b-4685-86d0-d50167e0f4c1_540x.webp'),
(37,'uploadDir/fb25d859-3427-4d37-96eb-cb36f8ae89d4-DSC09594_59315fe9-348b-4306-80c6-0a7260c52cf7_540x.webp'),
(37,'uploadDir/db9327ac-17f2-4ff4-9293-73b363558ef4-DSC09606_c497879b-312d-48bd-a2db-624e8b9f0a17_540x.webp');

/*Table structure for table `product_variants` */

DROP TABLE IF EXISTS `product_variants`;

CREATE TABLE `product_variants` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `price_adjustment` decimal(38,2) DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `variant_name` varchar(255) DEFAULT NULL,
  `variant_value` varchar(255) DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKosqitn4s405cynmhb87lkvuau` (`product_id`),
  CONSTRAINT `FKosqitn4s405cynmhb87lkvuau` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `product_variants` */

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `average_rating` double DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `discount_price` decimal(38,2) DEFAULT NULL,
  `product_name` varchar(100) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `release_date` date DEFAULT NULL,
  `sku` varchar(255) NOT NULL,
  `sold_count` int NOT NULL,
  `status` enum('ACTIVE','DISCONTINUED','DRAFT','OUT_OF_STOCK') DEFAULT NULL,
  `stock_quantity` int DEFAULT NULL,
  `total_reviews` int DEFAULT NULL,
  `brand_id` bigint DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  `vendor_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKfhmd06dsmj6k0n90swsh8ie9g` (`sku`),
  KEY `FKa3a4mpsfdf4d2y6r8ra3sc8mv` (`brand_id`),
  KEY `FKog2rp4qthbtt2lfyhfo32lsw9` (`category_id`),
  KEY `FKs6kdu75k7ub4s95ydsr52p59s` (`vendor_id`),
  CONSTRAINT `FKa3a4mpsfdf4d2y6r8ra3sc8mv` FOREIGN KEY (`brand_id`) REFERENCES `brands` (`id`),
  CONSTRAINT `FKog2rp4qthbtt2lfyhfo32lsw9` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`),
  CONSTRAINT `FKs6kdu75k7ub4s95ydsr52p59s` FOREIGN KEY (`vendor_id`) REFERENCES `vendors` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `products` */

insert  into `products`(`id`,`created_at`,`deleted`,`updated_at`,`average_rating`,`description`,`discount_price`,`product_name`,`price`,`release_date`,`sku`,`sold_count`,`status`,`stock_quantity`,`total_reviews`,`brand_id`,`category_id`,`vendor_id`) values 
(1,'2026-01-03 17:22:48.458459','','2026-01-04 13:32:56.840600',NULL,'A flowy midi dress perfect for parties or evening events. Soft fabric, flattering fit.',1000.00,'Elegant Embrace Dress',5000.00,'2026-01-16','4c',0,'ACTIVE',50,NULL,4,8,NULL),
(5,'2026-01-03 17:31:00.012209','','2026-01-04 13:33:01.086543',NULL,'Long, flowing abaya with soft fabrics, perfect for daily wear or special occasions.',500.00,'Elegant Flow Abaya',6000.00,'2026-01-15','4cc',0,'DRAFT',20,NULL,4,8,NULL),
(6,'2026-01-03 17:37:59.412081','','2026-01-04 13:33:16.463143',NULL,'A full-length, loose-fit black abaya made from breathable fabric. Perfect for daily wear, prayer, and formal occasions.',500.00,'Black Abaya',7000.00,'2026-01-23','fg4',0,'ACTIVE',50,NULL,2,8,NULL),
(7,'2026-01-03 17:40:51.611662','','2026-01-04 13:39:53.215022',NULL,'\n\nAn elegant kaftan dress featuring delicate embroidery. Comfortable, stylish, and ideal for parties or special events.',500.00,'Embroidered Kaftan Dress',10000.00,'2026-01-16','ht5',0,'ACTIVE',45,NULL,4,8,NULL),
(8,'2026-01-03 18:48:35.898336','','2026-01-04 13:37:25.269277',NULL,'fdsfsdfsd',454.00,'ghhfhgfhfg',45454.00,'2026-01-09','drer',0,'ACTIVE',5,NULL,2,1,1),
(9,'2026-01-04 12:20:19.656649','','2026-01-04 13:36:31.338131',NULL,'tyyyyyyyyyyy',54.00,'gthhhhhhhh',565.00,'2026-01-30','54df',0,'ACTIVE',4,NULL,2,1,1),
(10,'2026-01-04 13:10:57.805124','','2026-01-04 13:33:54.479864',NULL,'dededededededededede',3.00,'vendor',43.00,'2026-01-24','df3e43',0,'ACTIVE',3,NULL,4,8,1),
(11,'2026-01-04 13:18:03.321868','','2026-01-04 13:34:03.465943',NULL,'sdsdsdsdsdsdsdsdsdsdsd',4.00,'Robin',434.00,'2026-01-21','dfde4r5',0,'ACTIVE',3,NULL,4,8,1),
(12,'2026-01-04 13:40:38.720125','','2026-01-04 13:40:42.903372',NULL,'fggggggggg',33.00,'dfdfdfdfdfdfdfdfdfdfdf',455.00,'2026-01-22','cdas',0,'ACTIVE',3,NULL,2,3,1),
(13,'2026-01-04 13:41:13.622448','','2026-01-04 14:04:16.796361',NULL,'werrrrrrrrew',4.00,'girt',4534.00,'2026-01-14','redrw',0,'ACTIVE',4,NULL,1,7,1),
(14,'2026-01-04 14:09:57.394762','\0','2026-01-04 14:09:57.394762',NULL,'Soft, breathable cotton T-shirt with fun prints. Comfortable for playtime and daily wear.',0.00,'Sunny Day Cotton T-Shirt',450.00,'2026-01-24','ght3',0,'ACTIVE',100,NULL,1,10,2),
(15,'2026-01-04 14:11:13.061585','\0','2026-01-04 14:11:13.061585',NULL,'\nSoft, breathable cotton T-shirt with fun prints. Comfortable for playtime and daily wear.',50.00,'Winter Day Cotton T-Shirt',350.00,'2026-01-07','de3',0,'ACTIVE',23,NULL,1,10,2),
(16,'2026-01-04 14:12:47.323327','\0','2026-01-04 14:12:47.323327',NULL,'Soft, breathable cotton T-shirt with fun prints. Comfortable for playtime and daily wear.',50.00,'Cotton T-Shirt',500.00,'2026-01-14','dw3',0,'ACTIVE',23,NULL,1,10,1),
(17,'2026-01-04 14:16:02.641659','\0','2026-01-04 14:16:02.641659',NULL,'\nDurable denim jeans with a flexible waistband, designed for active kids and everyday adventures.',50.00,'Little Explorer Denim Jeans',500.00,'2026-01-24','dr',0,'DRAFT',50,NULL,2,10,2),
(18,'2026-01-04 14:23:47.441172','\0','2026-01-04 14:23:47.441172',NULL,'\nDurable denim jeans with a flexible waistband, designed for active kids and everyday adventures.',50.00,'Little Explorer Denim Jeans',400.00,'2026-01-16','q4',0,'ACTIVE',23,NULL,2,10,1),
(19,'2026-01-04 14:28:18.828321','\0','2026-01-04 14:28:18.828321',NULL,'\nWarm and cozy hoodie with a sporty look, ideal for cool weather and outdoor activities.',70.00,'Mini Champ Sports Hoodie',500.00,'2026-01-31','qr5',0,'ACTIVE',23,NULL,3,10,1),
(22,'2026-01-04 14:32:06.942812','\0','2026-01-04 14:32:06.942812',NULL,'\nStylish button-down shirt made from lightweight fabric, perfect for parties or family outings.',100.00,'Smart Junior Casual Shirt',600.00,'2026-01-16','dr3',0,'ACTIVE',23,NULL,2,10,1),
(23,'2026-01-04 14:36:49.615655','\0','2026-01-04 14:36:49.615655',NULL,'\nStylish button-down shirt made from lightweight fabric, perfect for parties or family outings.',70.00,'Smart Junior Casual Shirt',345.00,'2026-01-29','h7',0,'ACTIVE',23,NULL,3,10,1),
(24,'2026-01-04 14:40:40.851135','\0','2026-01-04 14:40:40.851135',NULL,'\nBeautifully designed dress with soft fabric and elegant details, perfect for birthdays and special occasions.',30.00,'Princess Bloom Party Dress',400.00,'2026-01-16','k2',0,'ACTIVE',12,NULL,3,10,1),
(25,'2026-01-04 14:41:46.515753','\0','2026-01-04 14:42:05.145097',NULL,'\nBeautifully designed dress with soft fabric and elegant details, perfect for birthdays and special occasions.',50.00,' Party Dress',500.00,'2026-01-21','kk7',0,'ACTIVE',24,NULL,3,10,1),
(26,'2026-01-04 14:44:29.374021','\0','2026-01-04 14:44:29.374021',NULL,'\nBeautifully designed dress with soft fabric and elegant details, perfect for birthdays and special occasions.',56.00,' Bloom Party Dress',600.00,'2026-01-10','f67',0,'ACTIVE',45,NULL,4,10,1),
(27,'2026-01-04 14:46:28.547343','\0','2026-01-04 14:46:28.547343',NULL,'\nLight and airy frock with colorful floral prints, great for summer days.',80.00,'Sweet Flower Summer Frock',700.00,'2026-01-29','l55',0,'ACTIVE',45,NULL,3,10,1),
(28,'2026-01-04 14:48:15.518234','\0','2026-01-04 14:48:15.518234',NULL,'Sweet Flower Summer Frock\nLight and airy frock with colorful floral prints, great for summer days.',70.00,'Summer Frock',670.00,'2026-01-28','k78',0,'ACTIVE',45,NULL,1,10,1),
(29,'2026-01-04 14:51:32.379605','\0','2026-01-04 14:51:32.379605',NULL,'\n\nFull-length abaya with soft, breathable fabric and subtle embroidery. Perfect for daily wear or formal occasions.',345.00,'Elegant Flow Abaya',3450.00,'2026-01-24','p4',0,'ACTIVE',34,NULL,3,8,1),
(30,'2026-01-04 14:52:27.941210','\0','2026-01-04 14:52:27.941210',NULL,'\nFull-length abaya with soft, breathable fabric and subtle embroidery. Perfect for daily wear or formal occasions.',50.00,' Abaya',450.00,'2026-01-10','g67',0,'DRAFT',45,NULL,3,8,1),
(31,'2026-01-04 14:53:33.857714','\0','2026-01-04 14:53:33.857714',NULL,'\nFull-length abaya with soft, breathable fabric and subtle embroidery. Perfect for daily wear or formal occasions.',67.00,' Abaya',767.00,'2026-01-24','p0',0,'ACTIVE',45,NULL,3,8,1),
(32,'2026-01-04 14:54:22.941324','\0','2026-01-04 14:54:22.941324',NULL,'\nFull-length abaya with soft, breathable fabric and subtle embroidery. Perfect for daily wear or formal occasions.',87.00,' Abaya',675.00,'2026-01-24','y6',0,'DRAFT',12,NULL,3,8,1),
(33,'2026-01-04 14:55:28.568250','\0','2026-01-04 14:55:28.568250',NULL,'Full-length abaya with soft, breathable fabric and subtle embroidery. Perfect for daily wear or formal occasions.',54.00,' Abaya',456.00,'2026-01-09','t6',0,'ACTIVE',67,NULL,3,8,1),
(34,'2026-01-04 15:03:51.134224','\0','2026-01-04 15:03:51.134224',NULL,'trrrrrrrrrrrrrr',54.00,'rtttrtrtr',5454.00,'2026-01-15','rer',0,'OUT_OF_STOCK',23,NULL,3,1,1),
(35,'2026-01-04 15:13:09.638697','\0','2026-01-04 15:13:09.638697',NULL,'\nStylish, modest shirt with a tailored fit, suitable for office or casual gatherings.',56.00,'Modern Slim-Fit Shirt',556.00,'2026-01-20','uy6',0,'ACTIVE',45,NULL,3,9,1),
(36,'2026-01-04 15:18:09.489385','\0','2026-01-04 15:18:09.489385',NULL,'Stylish, modest shirt with a tailored fit, suitable for office or casual gatherings.\n\n',45.00,'Panjabi',434.00,'2026-01-29','y67',0,'ACTIVE',76,NULL,3,9,2),
(37,'2026-01-04 15:36:18.220027','\0','2026-01-04 15:36:18.220027',NULL,'trfdh ldfa;t tytyt',54.00,'smart panjabi',454.00,'2026-01-09','lo9',0,'ACTIVE',56565,NULL,3,9,3);

/*Table structure for table `reviews` */

DROP TABLE IF EXISTS `reviews`;

CREATE TABLE `reviews` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpl51cejpw4gy5swfar8br9ngi` (`product_id`),
  KEY `FKsdlcf7wf8l1k0m00gik0m6b1m` (`user_id`),
  CONSTRAINT `FKpl51cejpw4gy5swfar8br9ngi` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FKsdlcf7wf8l1k0m00gik0m6b1m` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `reviews` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_name` varchar(255) NOT NULL,
  `date_created` datetime(6) NOT NULL,
  `last_updated` datetime(6) NOT NULL,
  `role_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `role` */

insert  into `role`(`role_name`,`date_created`,`last_updated`,`role_description`) values 
('ROLE_ADMIN','2026-01-03 09:11:45.889231','2026-01-04 07:03:04.302951','Admin role'),
('ROLE_MODERATOR','2026-01-03 09:11:46.429784','2026-01-04 07:03:04.426377','Default role for newly ROLE_MODERATOR record'),
('ROLE_USER','2026-01-03 09:11:46.421805','2026-01-04 07:03:04.420839','Default role for newly created record'),
('ROLE_VENDOR','2026-01-03 09:11:46.425795','2026-01-04 07:03:04.423275','Default role for newly created record');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_name` varchar(255) NOT NULL,
  `account_non_expired` bit(1) DEFAULT NULL,
  `account_non_locked` bit(1) DEFAULT NULL,
  `credentials_non_expired` bit(1) DEFAULT NULL,
  `date_created` datetime(6) NOT NULL,
  `email` varchar(255) NOT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `last_updated` datetime(6) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_first_name` varchar(255) DEFAULT NULL,
  `user_last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_name`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`user_name`,`account_non_expired`,`account_non_locked`,`credentials_non_expired`,`date_created`,`email`,`enabled`,`last_updated`,`password`,`user_first_name`,`user_last_name`) values 
('Abdullah','','','','2026-01-03 09:32:15.244648','abdullah@gmail.com','','2026-01-03 09:32:15.246653','$2a$10$tivw65zGAwLF6EGvkUn71OHWAABBFkzdb1vzsfVK1WyCjkup2zK3i','Mohammad','Abdullah'),
('admin123','','','','2026-01-03 09:11:46.576393','admin@gmail.com','','2026-01-03 09:14:25.070546','$2a$10$qS8mbQ.3gHOGuatj1xRSReHxdh9JEii04h1UVUzBSkkAYF655/tdi','admin','admin'),
('Habib','','','','2026-01-03 09:37:57.883616','habib@gmail.com','','2026-01-03 09:50:58.084588','$2a$10$z8rNGvNaPAnhbnNHaZ5BW.RN4N5WRpxH6yk/C1VT3GNNsq6LdJLri','Habib','Habib'),
('Hasan','','','','2026-01-03 09:27:40.598769','hasan@gmail.com','','2026-01-03 09:49:38.152220','$2a$10$yPlqIx3oQSlEezxJn.poX.emPqY5RzIvy5uTh5aA89omC0i00xBKq','Hasan','Hasan'),
('Ismam','','','','2026-01-03 09:29:40.817702','ismam@gmail.com','','2026-01-03 09:48:51.563209','$2a$10$8pIVU5oiRHreXEzNNDl.nOUgws5KfisJZvdYB9dCYkw6bRytws3ly','Ismam','Ismam'),
('Kayes','','','','2026-01-03 09:37:18.698192','kayes@gmail.com','','2026-01-03 09:37:18.700196','$2a$10$cR4rhGVeKjoS8EvveiC3wekSZP0HaoTYARgyB/hFRVPaCMW/IKRCS','Kayes','Kayes'),
('Mizan','','','','2026-01-03 09:34:12.350495','mizan@gmail.com','','2026-01-03 09:49:24.740772','$2a$10$H8sECa7rM6.Z/3x7RAIP5OoCS0R6grAuytHrL8QudsKzwyURe0aCm','Mohammad ','Mizan'),
('murad','','','','2026-01-03 09:26:01.084562','murad@gmail.com','','2026-01-04 07:03:04.606352','$2a$10$TD3cC5aq5URavD2ja9mDne/tpKkLASzFPWU2qZ6kcrGOoN8jXGYQC','murad','murad'),
('Nahid','','','','2026-01-03 09:35:34.706491','nahid@gmail.com','','2026-01-03 09:50:05.574009','$2a$10$VcDyfzII0bbaalz2mCbBCeYObGyzzYtmjDiwNIlc6P8uM/nISqWb2','Nahid','Nahid'),
('Obaidullah','','','','2026-01-03 09:36:10.148547','obaidullah@gmail.com','','2026-01-03 09:36:10.150550','$2a$10$.ys2KRHgeYDioJON9SJbCObrniE/YffLxDILI1EtphTIc2.kyIiNq','Obaidullah','Obaidullah'),
('Rakib','','','','2026-01-03 09:33:01.187591','rakib@gmail.com','','2026-01-03 09:50:41.623674','$2a$10$9RTV1dn1VGrU8k5cwx6UfeJna4bXJPFPKbtzVER1TP/xrwKvjzA2W','Mohammad','Rakib'),
('Robin','','','','2026-01-03 09:34:57.423028','robin@gmail.com','','2026-01-03 12:46:32.518691','$2a$10$736H08bWvNb7Yk9ZOpj0K.wQ6pZSGry3oFvK0stmZjcW7Mf/uO.Mm','Robin','Robin'),
('zia','','','','2026-01-04 07:04:55.378279','zia@gmail.com','','2026-01-04 07:04:55.386835','$2a$10$rO4XAF4/r4ZIMqZK8mMecu.fHBcDbli.1.YxZJ7wtwfgojq5gkj0e','zia','zia');

/*Table structure for table `user_product_views` */

DROP TABLE IF EXISTS `user_product_views`;

CREATE TABLE `user_product_views` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `viewed_at` datetime(6) DEFAULT NULL,
  `product_id` bigint NOT NULL,
  `user_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdbaaq3a1ag0yxt7is5b3ey9wv` (`product_id`),
  KEY `FKkhnrtn9lavum7dpvbc5wqfvse` (`user_id`),
  CONSTRAINT `FKdbaaq3a1ag0yxt7is5b3ey9wv` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FKkhnrtn9lavum7dpvbc5wqfvse` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user_product_views` */

/*Table structure for table `userrole` */

DROP TABLE IF EXISTS `userrole`;

CREATE TABLE `userrole` (
  `user_name` varchar(255) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  PRIMARY KEY (`user_name`,`role_name`),
  KEY `FK7x82xdby6jkfkj7n1rt8es9er` (`role_name`),
  CONSTRAINT `FK7x82xdby6jkfkj7n1rt8es9er` FOREIGN KEY (`role_name`) REFERENCES `role` (`role_name`),
  CONSTRAINT `FKk3ctmjfke6dpm6m9iirjb3kh0` FOREIGN KEY (`user_name`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `userrole` */

insert  into `userrole`(`user_name`,`role_name`) values 
('admin123','ROLE_ADMIN'),
('murad','ROLE_ADMIN'),
('admin123','ROLE_MODERATOR'),
('Habib','ROLE_MODERATOR'),
('murad','ROLE_MODERATOR'),
('Rakib','ROLE_MODERATOR'),
('Abdullah','ROLE_USER'),
('Kayes','ROLE_USER'),
('Obaidullah','ROLE_USER'),
('zia','ROLE_USER'),
('Hasan','ROLE_VENDOR'),
('Ismam','ROLE_VENDOR'),
('Mizan','ROLE_VENDOR'),
('Nahid','ROLE_VENDOR'),
('Robin','ROLE_VENDOR');

/*Table structure for table `vendor_orders` */

DROP TABLE IF EXISTS `vendor_orders`;

CREATE TABLE `vendor_orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `status` enum('CANCELLED','CONFIRMED','DELIVERED','PENDING','SHIPPED') DEFAULT NULL,
  `subtotal` decimal(38,2) DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  `vendor_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc0ijaglxwy47i5qvryd6fglu0` (`order_id`),
  KEY `FKgnnw47lqw9epw5soxdg69nbbh` (`vendor_id`),
  CONSTRAINT `FKc0ijaglxwy47i5qvryd6fglu0` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `FKgnnw47lqw9epw5soxdg69nbbh` FOREIGN KEY (`vendor_id`) REFERENCES `vendors` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `vendor_orders` */

/*Table structure for table `vendor_payouts` */

DROP TABLE IF EXISTS `vendor_payouts`;

CREATE TABLE `vendor_payouts` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `amount` decimal(38,2) NOT NULL,
  `method` varchar(255) NOT NULL,
  `payout_date` datetime(6) DEFAULT NULL,
  `reference` varchar(255) NOT NULL,
  `status` enum('PAID','PENDING') NOT NULL,
  `vendor_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr3qmvyi2ucgm0gf56a6xnn9cm` (`reference`),
  KEY `FKmugulu8p827i90o7w5vevew2j` (`vendor_id`),
  CONSTRAINT `FKmugulu8p827i90o7w5vevew2j` FOREIGN KEY (`vendor_id`) REFERENCES `vendors` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `vendor_payouts` */

/*Table structure for table `vendors` */

DROP TABLE IF EXISTS `vendors`;

CREATE TABLE `vendors` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `banner_url` varchar(255) DEFAULT NULL,
  `business_email` varchar(255) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `logo_url` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `shop_name` varchar(255) NOT NULL,
  `slug` varchar(255) NOT NULL,
  `status` enum('ACTIVE','PENDING','SUSPENDED') DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK2cmurjys8e1l80e0prvvdq19g` (`shop_name`),
  UNIQUE KEY `UK326w4yy3sqwkmpnd4gaqqfb13` (`slug`),
  UNIQUE KEY `UK33novltf5e2ys3noppqkegol` (`username`),
  CONSTRAINT `FKh99u3iwyyxivpoi57o9tdpu8j` FOREIGN KEY (`username`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `vendors` */

insert  into `vendors`(`id`,`created_at`,`deleted`,`updated_at`,`address`,`banner_url`,`business_email`,`description`,`logo_url`,`phone`,`rating`,`shop_name`,`slug`,`status`,`username`) values 
(1,'2026-01-03 18:13:03.095684','\0','2026-01-03 18:13:03.095684','Paltan, Dhaka','https://media.istockphoto.com/id/1387134070/photo/smart-store-management-systems-concept.jpg?s=612x612&w=0&k=20&c=zkk0Bxn5wvdL9SBlmAYx-hrZ_v_lQPxWVfocTj0HtHg=','smartShop@gmail.com','Smart Shop is a modern digital marketplace designed to make buying and selling easier, faster, and smarter. It connects customers, vendors, and administrators on a single powerful platform, offering a seamless shopping experience with secure transactions and real-time management tools.','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6K0iXPmjTFQ7BxGRpoVG25dfycQ4dlCsOOQ&s','01857550830',0,'Smart Shop','smart-shop','PENDING','Robin'),
(2,'2026-01-03 18:21:30.659633','\0','2026-01-03 18:21:30.659633','Head Office: Motijil, Dhaka','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2be28W_-5FsrHv0V9OjdcxJupeME60nRH4g&s','swiftShop@gmail.com','SwiftShop helps businesses grow faster in today’s digital marketplace. Whether you’re a small shop owner or a growing brand, SwiftShop gives you the tools to sell smarter and serve customers better.','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfhEmW1MOtlRfouFNWsNWiqt8Ie4m3REItLA&s','01795528534',0,'SwiftShop','swiftshop','PENDING','Abdullah'),
(3,'2026-01-04 15:30:38.397279','\0','2026-01-04 15:30:38.397279','chakBazar, Chattagram','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWlydapQi196vYmdCfBsInPZMWqvz60fRwfQ&s','nahid@gmail.com','Addit adl dlteriteofc dlsafrt altrterhwa atlgftrh aleret altrofhdbf anhfgter alds;trea ;atre','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWlydapQi196vYmdCfBsInPZMWqvz60fRwfQ&s','0968501524',0,'Nahid Shop','nahid-shop','PENDING','Nahid');

/*Table structure for table `wishlist` */

DROP TABLE IF EXISTS `wishlist`;

CREATE TABLE `wishlist` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd4r80jm8s41fgoa0xv9yy5lo8` (`user_id`),
  CONSTRAINT `FKd4r80jm8s41fgoa0xv9yy5lo8` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `wishlist` */

/*Table structure for table `wishlist_products` */

DROP TABLE IF EXISTS `wishlist_products`;

CREATE TABLE `wishlist_products` (
  `wishlist_id` bigint NOT NULL,
  `product_id` bigint NOT NULL,
  PRIMARY KEY (`wishlist_id`,`product_id`),
  KEY `FKpj5y3q6hyu53f8q4pd6n7rndc` (`product_id`),
  CONSTRAINT `FKhlq0ylq5sxd70s0pembuumc1d` FOREIGN KEY (`wishlist_id`) REFERENCES `wishlist` (`id`),
  CONSTRAINT `FKpj5y3q6hyu53f8q4pd6n7rndc` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `wishlist_products` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
