
(function() {
	console.log(1);
	setTimeout(function() {
		console.log(2);
	}, 1);

	for (var i = 0; i < 100000; i++) {
		if (i % 100 == 0) {
			console.log(i);
		}
	} 
})();