create table mahasiswa (
	id INT PRIMARY KEY AUTO_INCREMENT,
	npm VARCHAR(255),
	nama VARCHAR(255),
	ttl VARCHAR(255),
	tgl DATE,
	jk ENUM("Pria", "Wanita"),
	alamat TEXT
) Engine=InnoDB;