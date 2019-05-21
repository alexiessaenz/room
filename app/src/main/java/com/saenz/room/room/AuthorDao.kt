package com.saenz.room.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface AuthorDao {
    @Insert
    fun insert(author: Author)
    

    //@Update
    //fun update(vararg author: Author)

    // @Delete
    // fun delete(vararg author: Author)

    @Query("SELECT * FROM " + Author.TABLE_NAME + " ORDER BY last_Name, first_Name")
    fun getOrderedAuthors(): LiveData<List<Author>>
}