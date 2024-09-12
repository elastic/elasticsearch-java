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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.FailureStore

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.FailureStore">API
 *      specification</a>
 */
@JsonpDeserializable
public class FailureStore implements JsonpSerializable {
	private final boolean enabled;

	private final List<DataStreamIndex> indices;

	private final boolean rolloverOnWrite;

	// ---------------------------------------------------------------------------------------------

	private FailureStore(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.rolloverOnWrite = ApiTypeHelper.requireNonNull(builder.rolloverOnWrite, this, "rolloverOnWrite");

	}

	public static FailureStore of(Function<Builder, ObjectBuilder<FailureStore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<DataStreamIndex> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code rollover_on_write}
	 */
	public final boolean rolloverOnWrite() {
		return this.rolloverOnWrite;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (DataStreamIndex item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("rollover_on_write");
		generator.write(this.rolloverOnWrite);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FailureStore}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FailureStore> {
		private Boolean enabled;

		private List<DataStreamIndex> indices;

		private Boolean rolloverOnWrite;

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<DataStreamIndex> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(DataStreamIndex value, DataStreamIndex... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<DataStreamIndex.Builder, ObjectBuilder<DataStreamIndex>> fn) {
			return indices(fn.apply(new DataStreamIndex.Builder()).build());
		}

		/**
		 * Required - API name: {@code rollover_on_write}
		 */
		public final Builder rolloverOnWrite(boolean value) {
			this.rolloverOnWrite = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FailureStore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FailureStore build() {
			_checkSingleUse();

			return new FailureStore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FailureStore}
	 */
	public static final JsonpDeserializer<FailureStore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FailureStore::setupFailureStoreDeserializer);

	protected static void setupFailureStoreDeserializer(ObjectDeserializer<FailureStore.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(DataStreamIndex._DESERIALIZER), "indices");
		op.add(Builder::rolloverOnWrite, JsonpDeserializer.booleanDeserializer(), "rollover_on_write");

	}

}
