package com.github.scrobot.mifune.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories

@Configuration
@EnableCouchbaseRepositories
class CouchbaseConfiguration: AbstractCouchbaseConfiguration() {

    override fun getConnectionString(): String {
        TODO("Not yet implemented")
    }

    override fun getUserName(): String {
        TODO("Not yet implemented")
    }

    override fun getPassword(): String {
        TODO("Not yet implemented")
    }

    override fun getBucketName(): String {
        TODO("Not yet implemented")
    }
}