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

package co.elastic.clients.elasticsearch.security;

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
import java.util.List;
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

// typedef: security.get_builtin_privileges.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_builtin_privileges.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetBuiltinPrivilegesResponse implements JsonpSerializable {
	private final List<String> cluster;

	private final List<String> index;

	private final List<RemoteClusterPrivilege> remoteCluster;

	// ---------------------------------------------------------------------------------------------

	private GetBuiltinPrivilegesResponse(Builder builder) {

		this.cluster = ApiTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.remoteCluster = ApiTypeHelper.unmodifiable(builder.remoteCluster);

	}

	public static GetBuiltinPrivilegesResponse of(Function<Builder, ObjectBuilder<GetBuiltinPrivilegesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The list of cluster privileges that are understood by this version
	 * of Elasticsearch.
	 * <p>
	 * API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - The list of index privileges that are understood by this version
	 * of Elasticsearch.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Required - The list of remote_cluster privileges that are understood by this
	 * version of Elasticsearch.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final List<RemoteClusterPrivilege> remoteCluster() {
		return this.remoteCluster;
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

		if (ApiTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.remoteCluster)) {
			generator.writeKey("remote_cluster");
			generator.writeStartArray();
			for (RemoteClusterPrivilege item0 : this.remoteCluster) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBuiltinPrivilegesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetBuiltinPrivilegesResponse> {
		private List<String> cluster;

		private List<String> index;

		@Nullable
		private List<RemoteClusterPrivilege> remoteCluster;

		/**
		 * Required - The list of cluster privileges that are understood by this version
		 * of Elasticsearch.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final Builder cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return this;
		}

		/**
		 * Required - The list of cluster privileges that are understood by this version
		 * of Elasticsearch.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final Builder cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return this;
		}

		/**
		 * Required - The list of index privileges that are understood by this version
		 * of Elasticsearch.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - The list of index privileges that are understood by this version
		 * of Elasticsearch.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Required - The list of remote_cluster privileges that are understood by this
		 * version of Elasticsearch.
		 * <p>
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(List<RemoteClusterPrivilege> list) {
			this.remoteCluster = _listAddAll(this.remoteCluster, list);
			return this;
		}

		/**
		 * Required - The list of remote_cluster privileges that are understood by this
		 * version of Elasticsearch.
		 * <p>
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds one or more values to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(RemoteClusterPrivilege value, RemoteClusterPrivilege... values) {
			this.remoteCluster = _listAdd(this.remoteCluster, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetBuiltinPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBuiltinPrivilegesResponse build() {
			_checkSingleUse();

			return new GetBuiltinPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetBuiltinPrivilegesResponse}
	 */
	public static final JsonpDeserializer<GetBuiltinPrivilegesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetBuiltinPrivilegesResponse::setupGetBuiltinPrivilegesResponseDeserializer);

	protected static void setupGetBuiltinPrivilegesResponseDeserializer(
			ObjectDeserializer<GetBuiltinPrivilegesResponse.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::remoteCluster, JsonpDeserializer.arrayDeserializer(RemoteClusterPrivilege._DESERIALIZER),
				"remote_cluster");

	}

}
