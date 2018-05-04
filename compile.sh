#!/bin/sh
javac -cp ".:bukkit.jar" -d bin/ src/main/java/me/b303/diamondannounce/*.java
cp src/main/resources/* bin/
jar -cvf DiamondAnnounce.jar -C bin .
