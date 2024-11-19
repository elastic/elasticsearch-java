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

// typedef: security._types.RemoteClusterPrivileges

/**
 * The subset of cluster level privileges that can be defined for remote
 * clusters.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RemoteClusterPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoteClusterPrivileges implements JsonpSerializable {
	private final List<String> clusters;

	private final List<RemoteClusterPrivilege> privileges;

	// ---------------------------------------------------------------------------------------------

	private RemoteClusterPrivileges(Builder builder) {

		this.clusters = ApiTypeHelper.unmodifiableRequired(builder.clusters, this, "clusters");
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");

	}

	public static RemoteClusterPrivileges of(Function<Builder, ObjectBuilder<RemoteClusterPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A list of cluster aliases to which the permissions in this entry
	 * apply.
	 * <p>
	 * API name: {@code clusters}
	 */
	public final List<String> clusters() {
		return this.clusters;
	}

	/**
	 * Required - The cluster level privileges that owners of the role have on the
	 * remote cluster.
	 * <p>
	 * API name: {@code privileges}
	 */
	public final List<RemoteClusterPrivilege> privileges() {
		return this.privileges;
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

		if (ApiTypeHelper.isDefined(this.clusters)) {
			generator.writeKey("clusters");
			generator.writeStartArray();
			for (String item0 : this.clusters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.privileges)) {
			generator.writeKey("privileges");
			generator.writeStartArray();
			for (RemoteClusterPrivilege item0 : this.privileges) {
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
	 * Builder for {@link RemoteClusterPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RemoteClusterPrivileges> {
		private List<String> clusters;

		private List<RemoteClusterPrivilege> privileges;

		/**
		 * Required - A list of cluster aliases to which the permissions in this entry
		 * apply.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clusters</code>.
		 */
		public final Builder clusters(List<String> list) {
			this.clusters = _listAddAll(this.clusters, list);
			return this;
		}

		/**
		 * Required - A list of cluster aliases to which the permissions in this entry
		 * apply.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds one or more values to <code>clusters</code>.
		 */
		public final Builder clusters(String value, String... values) {
			this.clusters = _listAdd(this.clusters, value, values);
			return this;
		}

		/**
		 * Required - The cluster level privileges that owners of the role have on the
		 * remote cluster.
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>privileges</code>.
		 */
		public final Builder privileges(List<RemoteClusterPrivilege> list) {
			this.privileges = _listAddAll(this.privileges, list);
			return this;
		}

		/**
		 * Required - The cluster level privileges that owners of the role have on the
		 * remote cluster.
		 * <p>
		 * API name: {@code privileges}
		 * <p>
		 * Adds one or more values to <code>privileges</code>.
		 */
		public final Builder privileges(RemoteClusterPrivilege value, RemoteClusterPrivilege... values) {
			this.privileges = _listAdd(this.privileges, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoteClusterPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteClusterPrivileges build() {
			_checkSingleUse();

			return new RemoteClusterPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoteClusterPrivileges}
	 */
	public static final JsonpDeserializer<RemoteClusterPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemoteClusterPrivileges::setupRemoteClusterPrivilegesDeserializer);

	protected static void setupRemoteClusterPrivilegesDeserializer(
			ObjectDeserializer<RemoteClusterPrivileges.Builder> op) {

		op.add(Builder::clusters, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"clusters");
		op.add(Builder::privileges, JsonpDeserializer.arrayDeserializer(RemoteClusterPrivilege._DESERIALIZER),
				"privileges");

	}

}
