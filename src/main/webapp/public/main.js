(function() {
	// init
})();

document.getElementById("password").onkeyup = function() {
	var password = document.getElementById("password").value;
	var httpRequest = new XMLHttpRequest();
	httpRequest.onreadystatechange = function(data) {
		if (httpRequest.readyState === 4 && httpRequest.status === 200) {
			var response = JSON.parse(httpRequest.responseText);
			setValue('score', (response.score + '%'));
			setValue('complexity', response.complexity);
			// addition scores
			setValue('charLength', response.numberOfCharacters);
			setValue('charLengthBonus', response.numberOfCharactersBonus);
			setValue('uppercase', response.uppercaseLetters);
			setValue('uppercaseBonus', response.uppercaseLettersBonus);
			setValue('lowercase', response.lowercaseLetters);
			setValue('lowercaseBonus', response.lowercaseLettersBonus);
			setValue('numbers', response.numbers);
			setValue('numbersBonus', response.numbersBonus);
			setValue('symbols', response.symbols);
			setValue('symbolsBonus', response.symbolsBonus);
			setValue('middleNumbersAndSymbols', response.middleNumbersAndSymbols);
			setValue('middleNumbersAndSymbolsBonus', response.middleNumbersAndSymbolsBonus);
			setValue('requirements', response.requirements);
			setValue('requirementsBonus', response.requirementsBonus);
			// deduction scores
			setValue('lettersOnly', response.lettersOnly);
			setValue('lettersOnlyBonus', response.lettersOnlyBonus);
			setValue('numbersOnly', response.numbersOnly);
			setValue('numbersOnlyBonus', response.numbersOnlyBonus);
			setValue('consecutiveUppercaseLetters', response.consecutiveUppercase);
			setValue('consecutiveUppercaseLettersBonus', response.consecutiveUppercaseBonus);
			setValue('consecutiveLowercaseLetters', response.consecutiveLowercase);
			setValue('consecutiveLowercaseLettersBonus', response.consecutiveLowercaseBonus);
			setValue('consecutiveNumbers', response.consecutiveNumbers);
			setValue('consecutiveNumbersBonus', response.consecutiveNumbersBonus);
			setValue('sequentialLetters', response.sequentialLetters);
			setValue('sequentialLettersBonus', response.sequentialLettersBonus);
			setValue('sequentialNumbers', response.sequentialNumbers);
			setValue('sequentialNumbersBonus', response.sequentialNumbersBonus);
			setValue('sequentialSymbols', response.sequentialSymbols);
			setValue('sequentialSymbolsBonus', response.sequentialSymbolsBonus);
			setValue('repeatedCharacters', response.repeatedCharacters)
		}
	}
	httpRequest.open('POST', '/validate');
	httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')
	httpRequest.send('password=' + encodeURIComponent(password))
}

function setValue(id, value) {
	document.getElementById(id).innerHTML = value;
}
