package core.domain.service

import core.domain.value.SearchQuery

interface SearchNormalizer {
    fun normalize(query: SearchQuery): String
}
