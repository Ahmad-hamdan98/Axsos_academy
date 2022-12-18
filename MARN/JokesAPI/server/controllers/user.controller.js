const Jokes = require("../models/user.model");

module.exports.findAllJokes = (req, res) => {
  Jokes.find()
    .then(allDaJokess => res.json({ Jokess: allDaJokess }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.findOneSingleJokes = (req, res) => {
  Jokes.findOne({ _id: req.params.id })
    .then(oneSingleJokes => res.json({ Jokes: oneSingleJokes }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};
// module.exports.randomJokes = (req, res) => {
//   Jokes.count(function(err, count){
//     var random = Math.floor(Math.random() * count)
//     Jokes.findOne().skip(random)
//     .then(oneSingleJoker => res.json({ Jokes: oneSingleJoker }))
//     .catch(err => res.json({ message: "Something went wrong", error: err }))})
//   };
module.exports.randomJokes = (req, res) => {
  Jokes.aggregate([{ $sample: { size: 1 } }])
    .then(oneSingleJokes => res.json({ Jokes: oneSingleJokes }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.createNewJokes = (req, res) => {
  Jokes.create(req.body)
    .then(oneRandomJoke => res.json({ Jokes: oneRandomJoke }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.updateExistingJokes = (req, res) => {
  Jokes.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true })
    .then(updatedJokes => res.json({ Jokes: updatedJokes }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.deleteAnExistingJokes = (req, res) => {
  Jokes.deleteOne({ _id: req.params.id })
    .then(result => res.json({ result: result }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};
