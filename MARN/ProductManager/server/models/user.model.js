const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema({
	title: String,
	price: Number,
	description: String
});

const User = mongoose.model("project", UserSchema);

module.exports = User;