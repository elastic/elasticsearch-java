/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link Repository} variants.
 */
public class RepositoryBuilders {
	private RepositoryBuilders() {
	}

	/**
	 * Creates a builder for the {@link AzureRepository azure} {@code Repository}
	 * variant.
	 */
	public static AzureRepository.Builder azure() {
		return new AzureRepository.Builder();
	}

	/**
	 * Creates a Repository of the {@link AzureRepository azure} {@code Repository}
	 * variant.
	 */
	public static Repository azure(Function<AzureRepository.Builder, ObjectBuilder<AzureRepository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.azure(fn.apply(new AzureRepository.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GcsRepository gcs} {@code Repository}
	 * variant.
	 */
	public static GcsRepository.Builder gcs() {
		return new GcsRepository.Builder();
	}

	/**
	 * Creates a Repository of the {@link GcsRepository gcs} {@code Repository}
	 * variant.
	 */
	public static Repository gcs(Function<GcsRepository.Builder, ObjectBuilder<GcsRepository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.gcs(fn.apply(new GcsRepository.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ReadOnlyUrlRepository url}
	 * {@code Repository} variant.
	 */
	public static ReadOnlyUrlRepository.Builder url() {
		return new ReadOnlyUrlRepository.Builder();
	}

	/**
	 * Creates a Repository of the {@link ReadOnlyUrlRepository url}
	 * {@code Repository} variant.
	 */
	public static Repository url(Function<ReadOnlyUrlRepository.Builder, ObjectBuilder<ReadOnlyUrlRepository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.url(fn.apply(new ReadOnlyUrlRepository.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link S3Repository s3} {@code Repository} variant.
	 */
	public static S3Repository.Builder s3() {
		return new S3Repository.Builder();
	}

	/**
	 * Creates a Repository of the {@link S3Repository s3} {@code Repository}
	 * variant.
	 */
	public static Repository s3(Function<S3Repository.Builder, ObjectBuilder<S3Repository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.s3(fn.apply(new S3Repository.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SharedFileSystemRepository fs}
	 * {@code Repository} variant.
	 */
	public static SharedFileSystemRepository.Builder fs() {
		return new SharedFileSystemRepository.Builder();
	}

	/**
	 * Creates a Repository of the {@link SharedFileSystemRepository fs}
	 * {@code Repository} variant.
	 */
	public static Repository fs(
			Function<SharedFileSystemRepository.Builder, ObjectBuilder<SharedFileSystemRepository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.fs(fn.apply(new SharedFileSystemRepository.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SourceOnlyRepository source}
	 * {@code Repository} variant.
	 */
	public static SourceOnlyRepository.Builder source() {
		return new SourceOnlyRepository.Builder();
	}

	/**
	 * Creates a Repository of the {@link SourceOnlyRepository source}
	 * {@code Repository} variant.
	 */
	public static Repository source(Function<SourceOnlyRepository.Builder, ObjectBuilder<SourceOnlyRepository>> fn) {
		Repository.Builder builder = new Repository.Builder();
		builder.source(fn.apply(new SourceOnlyRepository.Builder()).build());
		return builder.build();
	}

}
