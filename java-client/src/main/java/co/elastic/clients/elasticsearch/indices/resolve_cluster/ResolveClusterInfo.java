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

package co.elastic.clients.elasticsearch.indices.resolve_cluster;

import co.elastic.clients.elasticsearch._types.ElasticsearchVersionMinInfo;
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
import java.lang.Boolean;
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

// typedef: indices.resolve_cluster.ResolveClusterInfo

/**
 * Provides information about each cluster request relevant to doing a
 * cross-cluster search.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.resolve_cluster.ResolveClusterInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResolveClusterInfo implements JsonpSerializable {
	private final boolean connected;

	private final boolean skipUnavailable;

	@Nullable
	private final Boolean matchingIndices;

	@Nullable
	private final String error;

	@Nullable
	private final ElasticsearchVersionMinInfo version;

	// ---------------------------------------------------------------------------------------------

	private ResolveClusterInfo(Builder builder) {

		this.connected = ApiTypeHelper.requireNonNull(builder.connected, this, "connected");
		this.skipUnavailable = ApiTypeHelper.requireNonNull(builder.skipUnavailable, this, "skipUnavailable");
		this.matchingIndices = builder.matchingIndices;
		this.error = builder.error;
		this.version = builder.version;

	}

	public static ResolveClusterInfo of(Function<Builder, ObjectBuilder<ResolveClusterInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether the remote cluster is connected to the local (querying)
	 * cluster.
	 * <p>
	 * API name: {@code connected}
	 */
	public final boolean connected() {
		return this.connected;
	}

	/**
	 * Required - The skip_unavailable setting for a remote cluster.
	 * <p>
	 * API name: {@code skip_unavailable}
	 */
	public final boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * Whether the index expression provided in the request matches any indices,
	 * aliases or data streams on the cluster.
	 * <p>
	 * API name: {@code matching_indices}
	 */
	@Nullable
	public final Boolean matchingIndices() {
		return this.matchingIndices;
	}

	/**
	 * Provides error messages that are likely to occur if you do a search with this
	 * index expression on the specified cluster (e.g., lack of security privileges
	 * to query an index).
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * Provides version information about the cluster.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final ElasticsearchVersionMinInfo version() {
		return this.version;
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

		generator.writeKey("connected");
		generator.write(this.connected);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		if (this.matchingIndices != null) {
			generator.writeKey("matching_indices");
			generator.write(this.matchingIndices);

		}
		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.version != null) {
			generator.writeKey("version");
			this.version.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveClusterInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ResolveClusterInfo> {
		private Boolean connected;

		private Boolean skipUnavailable;

		@Nullable
		private Boolean matchingIndices;

		@Nullable
		private String error;

		@Nullable
		private ElasticsearchVersionMinInfo version;

		/**
		 * Required - Whether the remote cluster is connected to the local (querying)
		 * cluster.
		 * <p>
		 * API name: {@code connected}
		 */
		public final Builder connected(boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * Required - The skip_unavailable setting for a remote cluster.
		 * <p>
		 * API name: {@code skip_unavailable}
		 */
		public final Builder skipUnavailable(boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * Whether the index expression provided in the request matches any indices,
		 * aliases or data streams on the cluster.
		 * <p>
		 * API name: {@code matching_indices}
		 */
		public final Builder matchingIndices(@Nullable Boolean value) {
			this.matchingIndices = value;
			return this;
		}

		/**
		 * Provides error messages that are likely to occur if you do a search with this
		 * index expression on the specified cluster (e.g., lack of security privileges
		 * to query an index).
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * Provides version information about the cluster.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable ElasticsearchVersionMinInfo value) {
			this.version = value;
			return this;
		}

		/**
		 * Provides version information about the cluster.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(
				Function<ElasticsearchVersionMinInfo.Builder, ObjectBuilder<ElasticsearchVersionMinInfo>> fn) {
			return this.version(fn.apply(new ElasticsearchVersionMinInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResolveClusterInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveClusterInfo build() {
			_checkSingleUse();

			return new ResolveClusterInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolveClusterInfo}
	 */
	public static final JsonpDeserializer<ResolveClusterInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResolveClusterInfo::setupResolveClusterInfoDeserializer);

	protected static void setupResolveClusterInfoDeserializer(ObjectDeserializer<ResolveClusterInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::matchingIndices, JsonpDeserializer.booleanDeserializer(), "matching_indices");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::version, ElasticsearchVersionMinInfo._DESERIALIZER, "version");

	}

}
