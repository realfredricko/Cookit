package com.example.cookease.cookease_features.data.local

import androidx.room.Database
import com.example.cookease.cookease_features.data.local.daos.RecipeDao
import com.example.cookease.cookease_features.data.local.daos.RecipeRemoteKeyDao
import com.example.cookease.cookease_features.data.model.Recipe
import com.example.cookease.cookease_features.data.model.RecipeRemoteKeys

/**Data entities represent tables in the app database
Database class provides the app with instances of the DAOs.
The app uses the DAOs to retrieve data from the database
as instances of the associated data entity*/
@Database(entities = [Recipe::class,RecipeRemoteKeys::class], version = 1)
abstract class CookeaseDatabase {
    abstract fun recipeDao(): RecipeDao
    abstract fun recipeRemoteKeyDao():RecipeRemoteKeyDao
}