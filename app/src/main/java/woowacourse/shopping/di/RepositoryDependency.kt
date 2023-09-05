package woowacourse.shopping.di

import woowacourse.shopping.data.CartRepository
import woowacourse.shopping.data.ProductRepository

interface RepositoryDependency {
    val cartRepository: CartRepository
    val productRepository: ProductRepository
}