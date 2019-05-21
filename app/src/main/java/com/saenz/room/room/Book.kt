package com.saenz.room.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = Book.TABLE_NAME)
data class Book(
    @ColumnInfo(name = "book_Title") @NotNull val bookTitle: String,
    @ColumnInfo(name = "book_Author") @NotNull val bookAuthor: String,
    @ColumnInfo(name = "book_Editorial") @NotNull val bookEditorial: String,
    @ColumnInfo(name = "book_Isb") @NotNull val bookIsb: String,
    @ColumnInfo(name = "book_Portrait") @NotNull val bookPortrait: String,
    @ColumnInfo(name = "book_Resume") @NotNull val bookResume: String
    //@ColumnInfo(name = "last_name") val lastName: String? = null
){
    companion object {
        const val TABLE_NAME = "book"
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "book_id")
    var bookId: Int = 0
}

/*
* nombre
* autores <- libroXautor
* editorial
* isb
* caratula
* resumen
* tags <- libroXtags
* */