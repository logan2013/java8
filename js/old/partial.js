(function() {
	
	var __ = {};
	
	Function.prototype.partial = function() {
		if (arguments < 1) {
			return this;
		}
		
		var _method = this;
		
		var storedArgs = arguments;
		
		return function() {
			
			var argumentIndex = 0;
			var realArgs = [];
			
			for (var i = 0; i < storedArgs.length; i++) {
				
				if (storedArgs[i] === __) {
					realArgs[i] = arguments[argumentIndex++];
				} else {
					realArgs[i] = storedArgs[i];
				}
			}
			
			return _method.apply(this, realArgs);
		};
	}
	
	String.prototype.remove = String.prototype.replace.partial(__, "");
	
	console.log("1I am23 not6787 1a4 888Number".remove(/\d/ig));
	
})();