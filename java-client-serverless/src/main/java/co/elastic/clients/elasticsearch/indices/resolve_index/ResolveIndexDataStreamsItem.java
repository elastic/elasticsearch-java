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

package co.elastic.clients.elasticsearch.indices.resolve_index;

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

// typedef: indices.resolve_index.ResolveIndexDataStreamsItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.resolve_index.ResolveIndexDataStreamsItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResolveIndexDataStreamsItem implements JsonpSerializable {
	private final String name;

	private final String timestampField;

	private final List<String> backingIndices;

	// ---------------------------------------------------------------------------------------------

	private ResolveIndexDataStreamsItem(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.timestampField = ApiTypeHelper.requireNonNull(builder.timestampField, this, "timestampField");
		this.backingIndices = ApiTypeHelper.unmodifiableRequired(builder.backingIndices, this, "backingIndices");

	}

	public static ResolveIndexDataStreamsItem of(Function<Builder, ObjectBuilder<ResolveIndexDataStreamsItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code timestamp_field}
	 */
	public final String timestampField() {
		return this.timestampField;
	}

	/**
	 * Required - API name: {@code backing_indices}
	 */
	public final List<String> backingIndices() {
		return this.backingIndices;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("timestamp_field");
		generator.write(this.timestampField);

		if (ApiTypeHelper.isDefined(this.backingIndices)) {
			generator.writeKey("backing_indices");
			generator.writeStartArray();
			for (String item0 : this.backingIndices) {
				generator.write(item0);

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
	 * Builder for {@link ResolveIndexDataStreamsItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ResolveIndexDataStreamsItem> {
		private String name;

		private String timestampField;

		private List<String> backingIndices;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp_field}
		 */
		public final Builder timestampField(String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * Required - API name: {@code backing_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>backingIndices</code>.
		 */
		public final Builder backingIndices(List<String> list) {
			this.backingIndices = _listAddAll(this.backingIndices, list);
			return this;
		}

		/**
		 * Required - API name: {@code backing_indices}
		 * <p>
		 * Adds one or more values to <code>backingIndices</code>.
		 */
		public final Builder backingIndices(String value, String... values) {
			this.backingIndices = _listAdd(this.backingIndices, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResolveIndexDataStreamsItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexDataStreamsItem build() {
			_checkSingleUse();

			return new ResolveIndexDataStreamsItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolveIndexDataStreamsItem}
	 */
	public static final JsonpDeserializer<ResolveIndexDataStreamsItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResolveIndexDataStreamsItem::setupResolveIndexDataStreamsItemDeserializer);

	protected static void setupResolveIndexDataStreamsItemDeserializer(
			ObjectDeserializer<ResolveIndexDataStreamsItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::backingIndices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"backing_indices");

	}

}
