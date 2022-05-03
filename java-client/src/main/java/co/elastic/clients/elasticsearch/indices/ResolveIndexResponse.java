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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.resolve_index.ResolveIndexAliasItem;
import co.elastic.clients.elasticsearch.indices.resolve_index.ResolveIndexDataStreamsItem;
import co.elastic.clients.elasticsearch.indices.resolve_index.ResolveIndexItem;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.resolve_index.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.resolve_index.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResolveIndexResponse implements JsonpSerializable {
	private final List<ResolveIndexItem> indices;

	private final List<ResolveIndexAliasItem> aliases;

	private final List<ResolveIndexDataStreamsItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	private ResolveIndexResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.aliases = ApiTypeHelper.unmodifiableRequired(builder.aliases, this, "aliases");
		this.dataStreams = ApiTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");

	}

	public static ResolveIndexResponse of(Function<Builder, ObjectBuilder<ResolveIndexResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<ResolveIndexItem> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code aliases}
	 */
	public final List<ResolveIndexAliasItem> aliases() {
		return this.aliases;
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public final List<ResolveIndexDataStreamsItem> dataStreams() {
		return this.dataStreams;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (ResolveIndexItem item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartArray();
			for (ResolveIndexAliasItem item0 : this.aliases) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartArray();
			for (ResolveIndexDataStreamsItem item0 : this.dataStreams) {
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
	 * Builder for {@link ResolveIndexResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ResolveIndexResponse> {
		private List<ResolveIndexItem> indices;

		private List<ResolveIndexAliasItem> aliases;

		private List<ResolveIndexDataStreamsItem> dataStreams;

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<ResolveIndexItem> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(ResolveIndexItem value, ResolveIndexItem... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<ResolveIndexItem.Builder, ObjectBuilder<ResolveIndexItem>> fn) {
			return indices(fn.apply(new ResolveIndexItem.Builder()).build());
		}

		/**
		 * Required - API name: {@code aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aliases</code>.
		 */
		public final Builder aliases(List<ResolveIndexAliasItem> list) {
			this.aliases = _listAddAll(this.aliases, list);
			return this;
		}

		/**
		 * Required - API name: {@code aliases}
		 * <p>
		 * Adds one or more values to <code>aliases</code>.
		 */
		public final Builder aliases(ResolveIndexAliasItem value, ResolveIndexAliasItem... values) {
			this.aliases = _listAdd(this.aliases, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code aliases}
		 * <p>
		 * Adds a value to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(Function<ResolveIndexAliasItem.Builder, ObjectBuilder<ResolveIndexAliasItem>> fn) {
			return aliases(fn.apply(new ResolveIndexAliasItem.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(List<ResolveIndexDataStreamsItem> list) {
			this.dataStreams = _listAddAll(this.dataStreams, list);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds one or more values to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(ResolveIndexDataStreamsItem value, ResolveIndexDataStreamsItem... values) {
			this.dataStreams = _listAdd(this.dataStreams, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds a value to <code>dataStreams</code> using a builder lambda.
		 */
		public final Builder dataStreams(
				Function<ResolveIndexDataStreamsItem.Builder, ObjectBuilder<ResolveIndexDataStreamsItem>> fn) {
			return dataStreams(fn.apply(new ResolveIndexDataStreamsItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResolveIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexResponse build() {
			_checkSingleUse();

			return new ResolveIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolveIndexResponse}
	 */
	public static final JsonpDeserializer<ResolveIndexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResolveIndexResponse::setupResolveIndexResponseDeserializer);

	protected static void setupResolveIndexResponseDeserializer(ObjectDeserializer<ResolveIndexResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(ResolveIndexItem._DESERIALIZER), "indices");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(ResolveIndexAliasItem._DESERIALIZER), "aliases");
		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(ResolveIndexDataStreamsItem._DESERIALIZER),
				"data_streams");

	}

}
