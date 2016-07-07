function Person() {}

Person.prototype.username = "zhangsan";
Person.prototype.password = "123";
Person.prototype.getInfo = function() {
	return this.username + this.password;
};

var person = new Person();
console.log(person.getInfo());