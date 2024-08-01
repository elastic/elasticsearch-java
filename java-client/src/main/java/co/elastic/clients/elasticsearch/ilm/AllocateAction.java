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

package co.elastic.clients.elasticsearch.ilm;

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

// typedef: ilm._types.AllocateAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.AllocateAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllocateAction implements JsonpSerializable {
	@Nullable
	private final Integer numberOfReplicas;

	@Nullable
	private final Integer totalShardsPerNode;

	private final Map<String, String> include;

	private final Map<String, String> exclude;

	private final Map<String, String> require;

	// ---------------------------------------------------------------------------------------------

	private AllocateAction(Builder builder) {

		this.numberOfReplicas = builder.numberOfReplicas;
		this.totalShardsPerNode = builder.totalShardsPerNode;
		this.include = ApiTypeHelper.unmodifiable(builder.include);
		this.exclude = ApiTypeHelper.unmodifiable(builder.exclude);
		this.require = ApiTypeHelper.unmodifiable(builder.require);

	}

	public static AllocateAction of(Function<Builder, ObjectBuilder<AllocateAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code number_of_replicas}
	 */
	@Nullable
	public final Integer numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * API name: {@code total_shards_per_node}
	 */
	@Nullable
	public final Integer totalShardsPerNode() {
		return this.totalShardsPerNode;
	}

	/**
	 * API name: {@code include}
	 */
	public final Map<String, String> include() {
		return this.include;
	}

	/**
	 * API name: {@code exclude}
	 */
	public final Map<String, String> exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code require}
	 */
	public final Map<String, String> require() {
		return this.require;
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

		if (this.numberOfReplicas != null) {
			generator.writeKey("number_of_replicas");
			generator.write(this.numberOfReplicas);

		}
		if (this.totalShardsPerNode != null) {
			generator.writeKey("total_shards_per_node");
			generator.write(this.totalShardsPerNode);

		}
		if (ApiTypeHelper.isDefined(this.include)) {
			generator.writeKey("include");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.include.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.exclude)) {
			generator.writeKey("exclude");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.exclude.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.require)) {
			generator.writeKey("require");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.require.entrySet()) {
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
	 * Builder for {@link AllocateAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AllocateAction> {
		@Nullable
		private Integer numberOfReplicas;

		@Nullable
		private Integer totalShardsPerNode;

		@Nullable
		private Map<String, String> include;

		@Nullable
		private Map<String, String> exclude;

		@Nullable
		private Map<String, String> require;

		/**
		 * API name: {@code number_of_replicas}
		 */
		public final Builder numberOfReplicas(@Nullable Integer value) {
			this.numberOfReplicas = value;
			return this;
		}

		/**
		 * API name: {@code total_shards_per_node}
		 */
		public final Builder totalShardsPerNode(@Nullable Integer value) {
			this.totalShardsPerNode = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>include</code>.
		 */
		public final Builder include(Map<String, String> map) {
			this.include = _mapPutAll(this.include, map);
			return this;
		}

		/**
		 * API name: {@code include}
		 * <p>
		 * Adds an entry to <code>include</code>.
		 */
		public final Builder include(String key, String value) {
			this.include = _mapPut(this.include, key, value);
			return this;
		}

		/**
		 * API name: {@code exclude}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>exclude</code>.
		 */
		public final Builder exclude(Map<String, String> map) {
			this.exclude = _mapPutAll(this.exclude, map);
			return this;
		}

		/**
		 * API name: {@code exclude}
		 * <p>
		 * Adds an entry to <code>exclude</code>.
		 */
		public final Builder exclude(String key, String value) {
			this.exclude = _mapPut(this.exclude, key, value);
			return this;
		}

		/**
		 * API name: {@code require}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>require</code>.
		 */
		public final Builder require(Map<String, String> map) {
			this.require = _mapPutAll(this.require, map);
			return this;
		}

		/**
		 * API name: {@code require}
		 * <p>
		 * Adds an entry to <code>require</code>.
		 */
		public final Builder require(String key, String value) {
			this.require = _mapPut(this.require, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocateAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocateAction build() {
			_checkSingleUse();

			return new AllocateAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocateAction}
	 */
	public static final JsonpDeserializer<AllocateAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AllocateAction::setupAllocateActionDeserializer);

	protected static void setupAllocateActionDeserializer(ObjectDeserializer<AllocateAction.Builder> op) {

		op.add(Builder::numberOfReplicas, JsonpDeserializer.integerDeserializer(), "number_of_replicas");
		op.add(Builder::totalShardsPerNode, JsonpDeserializer.integerDeserializer(), "total_shards_per_node");
		op.add(Builder::include, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"include");
		op.add(Builder::exclude, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::require, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"require");

	}

}
