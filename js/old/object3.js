(function() {
	
	function Person(username, password) {
		this.username = username;
		this.password = password;
		
		this.getInfo = function() {
			return this.username + this.password;
		};
	}
	
	var person = new Person("zhangsan", "123");
	console.log(person.getInfo());
	
})();