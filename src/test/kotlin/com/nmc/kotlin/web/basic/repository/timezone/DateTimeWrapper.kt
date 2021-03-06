package com.nmc.kotlin.web.basic.repository.timezone

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import java.io.Serializable
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.OffsetTime
import java.time.ZonedDateTime
import java.util.Objects

@Entity
@Table(name = "jhi_date_time_wrapper")
class DateTimeWrapper(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "instant")
    var instant: Instant? = null,

    @Column(name = "local_date_time")
    var localDateTime: LocalDateTime? = null,

    @Column(name = "offset_date_time")
    var offsetDateTime: OffsetDateTime? = null,

    @Column(name = "zoned_date_time")
    var zonedDateTime: ZonedDateTime? = null,

    @Column(name = "local_time")
    var localTime: LocalTime? = null,

    @Column(name = "offset_time")
    var offsetTime: OffsetTime? = null,

    @Column(name = "local_date")
    var localDate: LocalDate? = null

) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DateTimeWrapper) return false
        if (other.id == null || id == null) return false

        return Objects.equals(id, other.id)
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String {
        return "TimeZoneTest{" +
            "id=" + id +
            ", instant=" + instant +
            ", localDateTime=" + localDateTime +
            ", offsetDateTime=" + offsetDateTime +
            ", zonedDateTime=" + zonedDateTime +
            '}'.toString()
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}
