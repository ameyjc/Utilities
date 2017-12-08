package com.ameyc

import java.time.Duration
import java.time.Instant

class CalculateDuration {
  static void main(String[] args) {
    Instant start = Instant.parse(args[0])
    Instant end = Instant.parse(args[1])

    Duration duration = Duration.between(start, end)

    println duration

    println (100 / duration.toNanos() * Math.pow(10, 9))
  }
}