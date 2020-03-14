<html>
    <head>
        <style>
            td {border: 1px solid black;}
            table {collapse: collapse;}
        </style>
    </head>
    <body>
        <div id="container">
            <form action="/receiveFile" method="post" enctype="multipart/form-data">
                <table>
                    <tr>
                        <td></td>
                        <td> xxx</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><input type="radio" class="a" /> </td>
                        <td> xxx</td>
                        <td><input type="file" name="file" id="file1" /> </td>
                    </tr>
                    <tr>
                        <td><input type="radio" class="a" /> </td>
                        <td> xxx</td>
                        <td><input type="file" name="file" id="file2" /> </td>
                    </tr>
                    <tr>
                        <td><input type="radio" class="a" /> </td>
                        <td> xxx</td>
                        <td><input type="file" name="file" id="file3" /> </td>
                    </tr>
                </table>
            </form>
        </div>


        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script>
            $(function () {

            })
        </script>
    </body>
</html>