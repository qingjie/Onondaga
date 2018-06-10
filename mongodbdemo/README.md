start mongodb
mongod
mongo

show dbs
use orange
db.post.find()
db.author.find()


mongo --host IP --port 27017
use databasename
db.auth("root", "0p8rr@Fruit")
show collections
db.polygon_boundary.find().pretty()
db.polygon_boundary.getIndexes()
db.polygon_boundary.explain("executionStats").find({"name": "Colorado"})
