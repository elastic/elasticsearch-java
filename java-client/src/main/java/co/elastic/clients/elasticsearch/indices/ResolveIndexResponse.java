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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.resolve_index.Response
@JsonpDeserializable
public final class ResolveIndexResponse implements JsonpSerializable {
	private final List<ResolveIndexItem> indices;

	private final List<ResolveIndexAliasItem> aliases;

	private final List<ResolveIndexDataStreamsItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	public ResolveIndexResponse(Builder builder) {

		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.aliases = Objects.requireNonNull(builder.aliases, "aliases");
		this.dataStreams = Objects.requireNonNull(builder.dataStreams, "data_streams");

	}

	/**
	 * API name: {@code indices}
	 */
	public List<ResolveIndexItem> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code aliases}
	 */
	public List<ResolveIndexAliasItem> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code data_streams}
	 */
	public List<ResolveIndexDataStreamsItem> dataStreams() {
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

		generator.writeKey("indices");
		generator.writeStartArray();
		for (ResolveIndexItem item0 : this.indices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("aliases");
		generator.writeStartArray();
		for (ResolveIndexAliasItem item0 : this.aliases) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (ResolveIndexDataStreamsItem item0 : this.dataStreams) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveIndexResponse}.
	 */
	public static class Builder implements ObjectBuilder<ResolveIndexResponse> {
		private List<ResolveIndexItem> indices;

		private List<ResolveIndexAliasItem> aliases;

		private List<ResolveIndexDataStreamsItem> dataStreams;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<ResolveIndexItem> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(ResolveIndexItem... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(ResolveIndexItem value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Set {@link #indices(List)} to a singleton list.
		 */
		public Builder indices(Function<ResolveIndexItem.Builder, ObjectBuilder<ResolveIndexItem>> fn) {
			return this.indices(fn.apply(new ResolveIndexItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(Function<ResolveIndexItem.Builder, ObjectBuilder<ResolveIndexItem>> fn) {
			return this.addIndices(fn.apply(new ResolveIndexItem.Builder()).build());
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(List<ResolveIndexAliasItem> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(ResolveIndexAliasItem... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(ResolveIndexAliasItem value) {
			if (this.aliases == null) {
				this.aliases = new ArrayList<>();
			}
			this.aliases.add(value);
			return this;
		}

		/**
		 * Set {@link #aliases(List)} to a singleton list.
		 */
		public Builder aliases(Function<ResolveIndexAliasItem.Builder, ObjectBuilder<ResolveIndexAliasItem>> fn) {
			return this.aliases(fn.apply(new ResolveIndexAliasItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(Function<ResolveIndexAliasItem.Builder, ObjectBuilder<ResolveIndexAliasItem>> fn) {
			return this.addAliases(fn.apply(new ResolveIndexAliasItem.Builder()).build());
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(List<ResolveIndexDataStreamsItem> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(ResolveIndexDataStreamsItem... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(ResolveIndexDataStreamsItem value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * Set {@link #dataStreams(List)} to a singleton list.
		 */
		public Builder dataStreams(
				Function<ResolveIndexDataStreamsItem.Builder, ObjectBuilder<ResolveIndexDataStreamsItem>> fn) {
			return this.dataStreams(fn.apply(new ResolveIndexDataStreamsItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(
				Function<ResolveIndexDataStreamsItem.Builder, ObjectBuilder<ResolveIndexDataStreamsItem>> fn) {
			return this.addDataStreams(fn.apply(new ResolveIndexDataStreamsItem.Builder()).build());
		}

		/**
		 * Builds a {@link ResolveIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexResponse build() {

			return new ResolveIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResolveIndexResponse}
	 */
	public static final JsonpDeserializer<ResolveIndexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResolveIndexResponse::setupResolveIndexResponseDeserializer, Builder::build);

	protected static void setupResolveIndexResponseDeserializer(
			DelegatingDeserializer<ResolveIndexResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(ResolveIndexItem._DESERIALIZER), "indices");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(ResolveIndexAliasItem._DESERIALIZER), "aliases");
		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(ResolveIndexDataStreamsItem._DESERIALIZER),
				"data_streams");

	}

}
