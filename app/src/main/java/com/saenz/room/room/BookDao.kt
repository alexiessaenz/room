package com.saenz.room.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BookDao {
    @Insert
    fun insertBook(book: Book)

    //@Update
    //fun updateBook(vararg book: Book)

    // @Delete
    // fun delete(vararg author: Author)

    @Query("SELECT * FROM " + Book.TABLE_NAME + " ORDER BY book_Title, book_Author")
    fun getOrderedBooks(): LiveData<List<Book>>
}