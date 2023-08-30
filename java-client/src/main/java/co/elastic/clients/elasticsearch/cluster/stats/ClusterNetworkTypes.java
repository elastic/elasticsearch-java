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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNetworkTypes

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterNetworkTypes">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterNetworkTypes implements JsonpSerializable {
	private final Map<String, Integer> httpTypes;

	private final Map<String, Integer> transportTypes;

	// ---------------------------------------------------------------------------------------------

	private ClusterNetworkTypes(Builder builder) {

		this.httpTypes = ApiTypeHelper.unmodifiableRequired(builder.httpTypes, this, "httpTypes");
		this.transportTypes = ApiTypeHelper.unmodifiableRequired(builder.transportTypes, this, "transportTypes");

	}

	public static ClusterNetworkTypes of(Function<Builder, ObjectBuilder<ClusterNetworkTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Contains statistics about the HTTP network types used by selected
	 * nodes.
	 * <p>
	 * API name: {@code http_types}
	 */
	public final Map<String, Integer> httpTypes() {
		return this.httpTypes;
	}

	/**
	 * Required - Contains statistics about the transport network types used by
	 * selected nodes.
	 * <p>
	 * API name: {@code transport_types}
	 */
	public final Map<String, Integer> transportTypes() {
		return this.transportTypes;
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

		if (ApiTypeHelper.isDefined(this.httpTypes)) {
			generator.writeKey("http_types");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.httpTypes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.transportTypes)) {
			generator.writeKey("transport_types");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.transportTypes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link ClusterNetworkTypes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterNetworkTypes> {
		private Map<String, Integer> httpTypes;

		private Map<String, Integer> transportTypes;

		/**
		 * Required - Contains statistics about the HTTP network types used by selected
		 * nodes.
		 * <p>
		 * API name: {@code http_types}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>httpTypes</code>.
		 */
		public final Builder httpTypes(Map<String, Integer> map) {
			this.httpTypes = _mapPutAll(this.httpTypes, map);
			return this;
		}

		/**
		 * Required - Contains statistics about the HTTP network types used by selected
		 * nodes.
		 * <p>
		 * API name: {@code http_types}
		 * <p>
		 * Adds an entry to <code>httpTypes</code>.
		 */
		public final Builder httpTypes(String key, Integer value) {
			this.httpTypes = _mapPut(this.httpTypes, key, value);
			return this;
		}

		/**
		 * Required - Contains statistics about the transport network types used by
		 * selected nodes.
		 * <p>
		 * API name: {@code transport_types}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transportTypes</code>.
		 */
		public final Builder transportTypes(Map<String, Integer> map) {
			this.transportTypes = _mapPutAll(this.transportTypes, map);
			return this;
		}

		/**
		 * Required - Contains statistics about the transport network types used by
		 * selected nodes.
		 * <p>
		 * API name: {@code transport_types}
		 * <p>
		 * Adds an entry to <code>transportTypes</code>.
		 */
		public final Builder transportTypes(String key, Integer value) {
			this.transportTypes = _mapPut(this.transportTypes, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterNetworkTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNetworkTypes build() {
			_checkSingleUse();

			return new ClusterNetworkTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterNetworkTypes}
	 */
	public static final JsonpDeserializer<ClusterNetworkTypes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterNetworkTypes::setupClusterNetworkTypesDeserializer);

	protected static void setupClusterNetworkTypesDeserializer(ObjectDeserializer<ClusterNetworkTypes.Builder> op) {

		op.add(Builder::httpTypes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"http_types");
		op.add(Builder::transportTypes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()), "transport_types");

	}

}
