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
 * Builders for {@link SourceOnlyRepositorySettings} variants.
 */
public class SourceOnlyRepositorySettingsBuilders {
	private SourceOnlyRepositorySettingsBuilders() {
	}

	/**
	 * Creates a builder for the {@link SourceOnlyRepositorySettingsForAzure azure}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettingsForAzure.Builder azure() {
		return new SourceOnlyRepositorySettingsForAzure.Builder();
	}

	/**
	 * Creates a SourceOnlyRepositorySettings of the
	 * {@link SourceOnlyRepositorySettingsForAzure azure}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettings azure(
			Function<SourceOnlyRepositorySettingsForAzure.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForAzure>> fn) {
		SourceOnlyRepositorySettings.Builder builder = new SourceOnlyRepositorySettings.Builder();
		builder.azure(fn.apply(new SourceOnlyRepositorySettingsForAzure.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SourceOnlyRepositorySettingsForGcs gcs}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettingsForGcs.Builder gcs() {
		return new SourceOnlyRepositorySettingsForGcs.Builder();
	}

	/**
	 * Creates a SourceOnlyRepositorySettings of the
	 * {@link SourceOnlyRepositorySettingsForGcs gcs}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettings gcs(
			Function<SourceOnlyRepositorySettingsForGcs.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForGcs>> fn) {
		SourceOnlyRepositorySettings.Builder builder = new SourceOnlyRepositorySettings.Builder();
		builder.gcs(fn.apply(new SourceOnlyRepositorySettingsForGcs.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SourceOnlyRepositorySettingsForReadOnlyUrl
	 * url} {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettingsForReadOnlyUrl.Builder url() {
		return new SourceOnlyRepositorySettingsForReadOnlyUrl.Builder();
	}

	/**
	 * Creates a SourceOnlyRepositorySettings of the
	 * {@link SourceOnlyRepositorySettingsForReadOnlyUrl url}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettings url(
			Function<SourceOnlyRepositorySettingsForReadOnlyUrl.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForReadOnlyUrl>> fn) {
		SourceOnlyRepositorySettings.Builder builder = new SourceOnlyRepositorySettings.Builder();
		builder.url(fn.apply(new SourceOnlyRepositorySettingsForReadOnlyUrl.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SourceOnlyRepositorySettingsForS3 s3}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettingsForS3.Builder s3() {
		return new SourceOnlyRepositorySettingsForS3.Builder();
	}

	/**
	 * Creates a SourceOnlyRepositorySettings of the
	 * {@link SourceOnlyRepositorySettingsForS3 s3}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettings s3(
			Function<SourceOnlyRepositorySettingsForS3.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForS3>> fn) {
		SourceOnlyRepositorySettings.Builder builder = new SourceOnlyRepositorySettings.Builder();
		builder.s3(fn.apply(new SourceOnlyRepositorySettingsForS3.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the
	 * {@link SourceOnlyRepositorySettingsForSharedFileSystem fs}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettingsForSharedFileSystem.Builder fs() {
		return new SourceOnlyRepositorySettingsForSharedFileSystem.Builder();
	}

	/**
	 * Creates a SourceOnlyRepositorySettings of the
	 * {@link SourceOnlyRepositorySettingsForSharedFileSystem fs}
	 * {@code SourceOnlyRepositorySettings} variant.
	 */
	public static SourceOnlyRepositorySettings fs(
			Function<SourceOnlyRepositorySettingsForSharedFileSystem.Builder, ObjectBuilder<SourceOnlyRepositorySettingsForSharedFileSystem>> fn) {
		SourceOnlyRepositorySettings.Builder builder = new SourceOnlyRepositorySettings.Builder();
		builder.fs(fn.apply(new SourceOnlyRepositorySettingsForSharedFileSystem.Builder()).build());
		return builder.build();
	}

}
