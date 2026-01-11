package com.bahibhai.ledger.repository
import com.google.firebase.database.FirebaseDatabase
class RealtimeRepo {
private val db = FirebaseDatabase.getInstance().reference
fun testWrite(){
db.child("test").setValue("connected")
}
}