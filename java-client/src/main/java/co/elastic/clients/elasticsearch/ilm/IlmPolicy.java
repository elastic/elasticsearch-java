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

import co.elastic.clients.json.JsonData;
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

// typedef: ilm._types.Policy

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.Policy">API
 *      specification</a>
 */
@JsonpDeserializable
public class IlmPolicy implements JsonpSerializable {
	private final Phases phases;

	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	private IlmPolicy(Builder builder) {

		this.phases = ApiTypeHelper.requireNonNull(builder.phases, this, "phases");
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);

	}

	public static IlmPolicy of(Function<Builder, ObjectBuilder<IlmPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code phases}
	 */
	public final Phases phases() {
		return this.phases;
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
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

		generator.writeKey("phases");
		this.phases.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link IlmPolicy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IlmPolicy> {
		private Phases phases;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IlmPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IlmPolicy build() {
			_checkSingleUse();

			return new IlmPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IlmPolicy}
	 */
	public static final JsonpDeserializer<IlmPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IlmPolicy::setupIlmPolicyDeserializer);

	protected static void setupIlmPolicyDeserializer(ObjectDeserializer<IlmPolicy.Builder> op) {

		op.add(Builder::phases, Phases._DESERIALIZER, "phases");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");

	}

}
