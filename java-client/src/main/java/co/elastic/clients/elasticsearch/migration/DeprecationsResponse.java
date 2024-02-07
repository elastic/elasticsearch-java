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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch.migration.deprecations.Deprecation;
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
import java.util.Map;
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

// typedef: migration.deprecations.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#migration.deprecations.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeprecationsResponse implements JsonpSerializable {
	private final List<Deprecation> clusterSettings;

	private final Map<String, List<Deprecation>> indexSettings;

	private final List<Deprecation> nodeSettings;

	private final List<Deprecation> mlSettings;

	// ---------------------------------------------------------------------------------------------

	private DeprecationsResponse(Builder builder) {

		this.clusterSettings = ApiTypeHelper.unmodifiableRequired(builder.clusterSettings, this, "clusterSettings");
		this.indexSettings = ApiTypeHelper.unmodifiableRequired(builder.indexSettings, this, "indexSettings");
		this.nodeSettings = ApiTypeHelper.unmodifiableRequired(builder.nodeSettings, this, "nodeSettings");
		this.mlSettings = ApiTypeHelper.unmodifiableRequired(builder.mlSettings, this, "mlSettings");

	}

	public static DeprecationsResponse of(Function<Builder, ObjectBuilder<DeprecationsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster_settings}
	 */
	public final List<Deprecation> clusterSettings() {
		return this.clusterSettings;
	}

	/**
	 * Required - API name: {@code index_settings}
	 */
	public final Map<String, List<Deprecation>> indexSettings() {
		return this.indexSettings;
	}

	/**
	 * Required - API name: {@code node_settings}
	 */
	public final List<Deprecation> nodeSettings() {
		return this.nodeSettings;
	}

	/**
	 * Required - API name: {@code ml_settings}
	 */
	public final List<Deprecation> mlSettings() {
		return this.mlSettings;
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

		if (ApiTypeHelper.isDefined(this.clusterSettings)) {
			generator.writeKey("cluster_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.clusterSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indexSettings)) {
			generator.writeKey("index_settings");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.indexSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nodeSettings)) {
			generator.writeKey("node_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.nodeSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.mlSettings)) {
			generator.writeKey("ml_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.mlSettings) {
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
	 * Builder for {@link DeprecationsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DeprecationsResponse> {
		private List<Deprecation> clusterSettings;

		private Map<String, List<Deprecation>> indexSettings;

		private List<Deprecation> nodeSettings;

		private List<Deprecation> mlSettings;

		/**
		 * Required - API name: {@code cluster_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clusterSettings</code>.
		 */
		public final Builder clusterSettings(List<Deprecation> list) {
			this.clusterSettings = _listAddAll(this.clusterSettings, list);
			return this;
		}

		/**
		 * Required - API name: {@code cluster_settings}
		 * <p>
		 * Adds one or more values to <code>clusterSettings</code>.
		 */
		public final Builder clusterSettings(Deprecation value, Deprecation... values) {
			this.clusterSettings = _listAdd(this.clusterSettings, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code cluster_settings}
		 * <p>
		 * Adds a value to <code>clusterSettings</code> using a builder lambda.
		 */
		public final Builder clusterSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return clusterSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Required - API name: {@code index_settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(Map<String, List<Deprecation>> map) {
			this.indexSettings = _mapPutAll(this.indexSettings, map);
			return this;
		}

		/**
		 * Required - API name: {@code index_settings}
		 * <p>
		 * Adds an entry to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(String key, List<Deprecation> value) {
			this.indexSettings = _mapPut(this.indexSettings, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeSettings</code>.
		 */
		public final Builder nodeSettings(List<Deprecation> list) {
			this.nodeSettings = _listAddAll(this.nodeSettings, list);
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 * <p>
		 * Adds one or more values to <code>nodeSettings</code>.
		 */
		public final Builder nodeSettings(Deprecation value, Deprecation... values) {
			this.nodeSettings = _listAdd(this.nodeSettings, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code node_settings}
		 * <p>
		 * Adds a value to <code>nodeSettings</code> using a builder lambda.
		 */
		public final Builder nodeSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return nodeSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Required - API name: {@code ml_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>mlSettings</code>.
		 */
		public final Builder mlSettings(List<Deprecation> list) {
			this.mlSettings = _listAddAll(this.mlSettings, list);
			return this;
		}

		/**
		 * Required - API name: {@code ml_settings}
		 * <p>
		 * Adds one or more values to <code>mlSettings</code>.
		 */
		public final Builder mlSettings(Deprecation value, Deprecation... values) {
			this.mlSettings = _listAdd(this.mlSettings, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code ml_settings}
		 * <p>
		 * Adds a value to <code>mlSettings</code> using a builder lambda.
		 */
		public final Builder mlSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return mlSettings(fn.apply(new Deprecation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeprecationsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeprecationsResponse build() {
			_checkSingleUse();

			return new DeprecationsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeprecationsResponse}
	 */
	public static final JsonpDeserializer<DeprecationsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeprecationsResponse::setupDeprecationsResponseDeserializer);

	protected static void setupDeprecationsResponseDeserializer(ObjectDeserializer<DeprecationsResponse.Builder> op) {

		op.add(Builder::clusterSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER),
				"cluster_settings");
		op.add(Builder::indexSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"index_settings");
		op.add(Builder::nodeSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "node_settings");
		op.add(Builder::mlSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "ml_settings");

	}

}
