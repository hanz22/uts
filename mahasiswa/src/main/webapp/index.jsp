<html>
    <head>
        <title>Data Mahasiswa</title>
    </head>
    <body>
        <h1><p align="left">Entri Mahasiswa</p></h1>
        <form name="form1" method="POST" action="MahasiswaServlet">
            <input type="hidden" name="action" value="insert" />
        <table>
        <tr><td>NPM</td> <td><input type="text" name="nim" size="30"></td></tr>
        <tr><td>Nama</td> <td><input type="text" name="nama" size="30"></td></tr>
        <tr><td>Tempat Lahir</td> <td><input type="text" name="ttl" size="30"></td></tr>
        <tr><td>Tanggal Lahir</td> <td><input type="text" name="tgl" size="30"></td></tr>
        <tr><td>Jenis Kelamin</td> <td><input type="text" name="jk" size="30"></td></tr>
        <tr><td>Alamat</td><td><textarea type="text" name="alamat" size="30"></textarea></td></tr>
        <tr align="right"><td><p align="right"><input value="Simpan" name="submit" type="submit" /></td><td><input value="Reset" type="reset" /></p></td></tr>
        <tr></tr>
        </table>
        </form>
    </body>
</html>