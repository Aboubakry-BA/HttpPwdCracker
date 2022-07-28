<?php 
if(isset($_GET["pwd"])){ 
if($_GET["pwd"]=="aabza"){
     echo"Mot de passe trouvé";
}
else{
    echo"c'est pas le bon";
}

?>
<?php }else { ?>
<!DOCTYPE html>
<html lang="fr">
<head>
    <title>Document</title>
</head>
<body>
    <form method="GET">
        <input type="password" name="pwd">
        <input type="submit" value="valider">
    </form>
</body>
</html>
<?php } ?>