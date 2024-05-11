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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: nodes._types.RepositoryLocation

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.RepositoryLocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryLocation implements JsonpSerializable {
	private final String basePath;

	@Nullable
	private final String container;

	@Nullable
	private final String bucket;

	// ---------------------------------------------------------------------------------------------

	private RepositoryLocation(Builder builder) {

		this.basePath = ApiTypeHelper.requireNonNull(builder.basePath, this, "basePath");
		this.container = builder.container;
		this.bucket = builder.bucket;

	}

	public static RepositoryLocation of(Function<Builder, ObjectBuilder<RepositoryLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code base_path}
	 */
	public final String basePath() {
		return this.basePath;
	}

	/**
	 * Container name (Azure)
	 * <p>
	 * API name: {@code container}
	 */
	@Nullable
	public final String container() {
		return this.container;
	}

	/**
	 * Bucket name (GCP, S3)
	 * <p>
	 * API name: {@code bucket}
	 */
	@Nullable
	public final String bucket() {
		return this.bucket;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("base_path");
		generator.write(this.basePath);

		if (this.container != null) {
			generator.writeKey("container");
			generator.write(this.container);

		}
		if (this.bucket != null) {
			generator.writeKey("bucket");
			generator.write(this.bucket);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryLocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryLocation> {
		private String basePath;

		@Nullable
		private String container;

		@Nullable
		private String bucket;

		/**
		 * Required - API name: {@code base_path}
		 */
		public final Builder basePath(String value) {
			this.basePath = value;
			return this;
		}

		/**
		 * Container name (Azure)
		 * <p>
		 * API name: {@code container}
		 */
		public final Builder container(@Nullable String value) {
			this.container = value;
			return this;
		}

		/**
		 * Bucket name (GCP, S3)
		 * <p>
		 * API name: {@code bucket}
		 */
		public final Builder bucket(@Nullable String value) {
			this.bucket = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryLocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryLocation build() {
			_checkSingleUse();

			return new RepositoryLocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoryLocation}
	 */
	public static final JsonpDeserializer<RepositoryLocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoryLocation::setupRepositoryLocationDeserializer);

	protected static void setupRepositoryLocationDeserializer(ObjectDeserializer<RepositoryLocation.Builder> op) {

		op.add(Builder::basePath, JsonpDeserializer.stringDeserializer(), "base_path");
		op.add(Builder::container, JsonpDeserializer.stringDeserializer(), "container");
		op.add(Builder::bucket, JsonpDeserializer.stringDeserializer(), "bucket");

	}

}
