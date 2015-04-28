<html>
<head>
<link rel="stylesheet" type="text/css" href="/public/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/public/main.css">
<title>Avaliador de seguran&ccedil;a de senha</title>
</head>
<body>
<br/>
<div class="container"> <!-- begin container -->
<div class="row"> <!-- begin row -->
  <div class="well col-md-6"> <!-- begin well -->
    <legend>Avaliador de seguran&ccedil;a de senha</legend>
    <input id="password" type="password" class="form-control" id="inputEmail" placeholder="Senha">
    <span id="score" class="label label-default">0%</span>&nbsp;
    <span id="complexity" class="label label-danger">Muito curta</span>
   </div> <!-- end well -->
</div><!-- end row -->
<div class="row col-md-6"> <!-- begin row -->
<table class="table table-condensed">
  <thead>
    <th>Regras de adi&ccedil;&atilde;o</th>
    <th>Quantidade</th>
    <th>B&ocirc;nus</th>
  </thead>
  <tbody>
  	<tr>
  	  <td>N&uacute;mero de caracteres</td>
  	  <td id="charLength">0</td>
  	  <td id="charLengthBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Letras Mai&uacute;sculas</td>
  	  <td id="uppercase">0</td>
  	  <td id="uppercaseBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Letras Min&uacute;sculas</td>
  	  <td id="lowercase">0</td>
  	  <td id="lowercaseBonus">0</td>
  	</tr>
   	<tr>
  	  <td>N&uacute;meros</td>
  	  <td id="numbers">0</td>
  	  <td id="numbersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>S&iacute;mbolos</td>
  	  <td id="symbols">0</td>
  	  <td id="symbolsBonus">0</td>
  	</tr>
  	<tr>
  	  <td>N&iacute;meros e S&iacute;mbolos (meio)</td>
  	  <td id="middleNumbersAndSymbols">0</td>
  	  <td id="middleNumbersAndSymbolsBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Requisitos</td>
  	  <td id="requirements">0</td>
  	  <td id="requirementsBonus">0</td>
  	</tr>
  </tbody>
</table>
<table class="table table-condensed">
  <thead>
    <th>Regras de subtra&ccedil;&atilde;o</th>
    <th>Quantidade</th>
    <th>B&ocirc;nus</th>
  </thead>
  <tbody>
  	<tr>
  	  <td>Somente letras</td>
  	  <td id="lettersOnly">0</td>
  	  <td id="lettersOnlyBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Somente N&uacute;meros</td>
  	  <td id="numbersOnly">0</td>
  	  <td id="numbersOnlyBonus">0</td>
  	</tr>
  	<tr class="warning">
  	  <td>Caracteres Repetidos</td>
  	  <td id="repeatedCharacters">0</td>
  	  <td id="repeatedCharsBonus">0</td>
  	</tr>
   	<tr>
  	  <td>Letras Mai&uacute;sculas Consecutivas</td>
  	  <td id="consecutiveUppercaseLetters">0</td>
  	  <td id="consecutiveUppercaseLettersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Letras Min&uacute;sculas Consecutivas</td>
  	  <td id="consecutiveLowercaseLetters">0</td>
  	  <td id="consecutiveLowercaseLettersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>N&uacute;meros Consecutivos</td>
  	  <td id="consecutiveNumbers">0</td>
  	  <td id="consecutiveNumbersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>Letras Sequenciais</td>
  	  <td id="sequentialLetters">0</td>
  	  <td id="sequentialLettersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>N&uacute;meros Sequenciais</td>
  	  <td id="sequentialNumbers">0</td>
  	  <td id="sequentialNumbersBonus">0</td>
  	</tr>
  	<tr>
  	  <td>S&iacute;mbolos Sequenciais</td>
  	  <td id="sequentialSymbols">0</td>
  	  <td id="sequentialSymbolsBonus">0</td>
  	</tr>
  </tbody>
</table>
</div><!-- end row -->
</div><!-- end container -->
<script type="text/javascript" src="/public/main.js"></script>
</body>
</html>
