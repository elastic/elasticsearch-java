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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: snapshot._types.S3Repository

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot._types.S3Repository">API
 *      specification</a>
 */
@JsonpDeserializable
public class S3Repository extends RepositoryBase implements RepositoryVariant {
	private final S3RepositorySettings settings;

	// ---------------------------------------------------------------------------------------------

	private S3Repository(Builder builder) {
		super(builder);

		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

	}

	public static S3Repository of(Function<Builder, ObjectBuilder<S3Repository>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Repository variant kind.
	 */
	@Override
	public Repository.Kind _repositoryKind() {
		return Repository.Kind.S3;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final S3RepositorySettings settings() {
		return this.settings;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "s3");
		super.serializeInternal(generator, mapper);
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link S3Repository}.
	 */

	public static class Builder extends RepositoryBase.AbstractBuilder<Builder> implements ObjectBuilder<S3Repository> {
		private S3RepositorySettings settings;

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(S3RepositorySettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Function<S3RepositorySettings.Builder, ObjectBuilder<S3RepositorySettings>> fn) {
			return this.settings(fn.apply(new S3RepositorySettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link S3Repository}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public S3Repository build() {
			_checkSingleUse();

			return new S3Repository(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link S3Repository}
	 */
	public static final JsonpDeserializer<S3Repository> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			S3Repository::setupS3RepositoryDeserializer);

	protected static void setupS3RepositoryDeserializer(ObjectDeserializer<S3Repository.Builder> op) {
		RepositoryBase.setupRepositoryBaseDeserializer(op);
		op.add(Builder::settings, S3RepositorySettings._DESERIALIZER, "settings");

		op.ignore("type");
	}

}
