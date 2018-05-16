package cc.istarx.criminalintent.modules

import java.util.*

class Crime() {
    var mTitle: String = ""
    var mDate: Date = Date()
    var mIsSolved: Boolean = false
    var mId: UUID = UUID.randomUUID()
}