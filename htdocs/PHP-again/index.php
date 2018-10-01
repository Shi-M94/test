<!DOCTYPE html>
<html lang="ja">
<head>
        <meta charset="UTF-8">
        <title>PHPの復習</title>
        <link rel="stylesheet" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
</head>
<body>
     <?php
            mb_internal_encoding("utf8");
            $pdo = new PDO("mysql:dbname=lessonms;host=localhost;","root","mysql");
            $stmt = $pdo->query("select * from 4each_keijiban2");
        ?>
    
    <a href="index (2).php"><img src="4eachblog_logo.jpg"></a>
    <header>
       <ul>
        <a href="index (2).php"><li>トップ</li></a>
        <li>プロフィール</li>
        <li>4eachについて</li>
        <li>登録フォーム</li>
        <li>問い合わせ</li>
        <li>その他</li>
      </ul>  
    </header> 
    
  <main>
    <left>
        <h2>プログラミングに役立つ掲示板</h2>
        
        <form method="post" action="insert.php">
            <h3 class="nyuuryoku">入力フォーム</h3>
            <div>
                <label>ハンドルネーム</label><br>
                <input type="text" size="35" name="handlename">
            </div>
            <div>
                <label>タイトル</label><br>
                <input type="text" size="35" name="title">
            </div>
            <div>
                <label>コメント</label><br>
                <textarea cols="50" rows="7" name="comments"></textarea>
            </div>
            <div>
                <input type="submit" class="submit" value="投稿する">
            </div>
        </form>
        
        <div>
            <?php
            while($row = $stmt->fetch()){
            echo "<form>";
            echo "<div class='kiji'>";
            echo "<h4>".$row['title']."</h4>";
                echo "<div class='contents'>";
                echo $row['comments'];
                echo "<div class='handlename'>posted by".$row['handlename']."</div>";
                echo "</div>";
            echo "</div>";
            echo "</form>";
            }
            ?>
        </div>
        
        
        
        
    </left>
        
    <right>
        <h3>人気の記事</h3>
            <ul>
                <li>PHPオススメ</li>
                <li>PHP MyAdminの使い方</li>
                <li>今人気のエディタ</li>
                <li>HTMLの基礎</li>
            </ul>
        <h3>オススメリンク</h3>
            <ul>
                <li>インターノウス株式会社</li>
                <li>XAMPPのダウンロード</li>
                <li>Eclipseのダウンロード</li>
                <li>Bracketsのダウンロード</li>
         </ul>
        <h3>カテゴリ</h3>
            <ul>
             <li>HTML</li>
                <li>PHP</li>
                <li>MySQL</li>
                <li>JavaScript</li>
         </ul>
    </right>
        
    </main>    
        
    <footer>copyright © internous | 4each blog s the one which provides A to Z about programing.</footer>
    <script type="text/javascript" src="script.js"></script> 
        
    
    
    </body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    