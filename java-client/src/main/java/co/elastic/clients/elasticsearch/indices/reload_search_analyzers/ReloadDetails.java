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

package co.elastic.clients.elasticsearch.indices.reload_search_analyzers;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.reload_search_analyzers.ReloadDetails
@JsonpDeserializable
public class ReloadDetails implements JsonpSerializable {
	private final String index;

	private final List<String> reloadedAnalyzers;

	private final List<String> reloadedNodeIds;

	// ---------------------------------------------------------------------------------------------

	private ReloadDetails(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.reloadedAnalyzers = ModelTypeHelper.unmodifiableRequired(builder.reloadedAnalyzers, this,
				"reloadedAnalyzers");
		this.reloadedNodeIds = ModelTypeHelper.unmodifiableRequired(builder.reloadedNodeIds, this, "reloadedNodeIds");

	}

	public static ReloadDetails of(Function<Builder, ObjectBuilder<ReloadDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code reloaded_analyzers}
	 */
	public final List<String> reloadedAnalyzers() {
		return this.reloadedAnalyzers;
	}

	/**
	 * Required - API name: {@code reloaded_node_ids}
	 */
	public final List<String> reloadedNodeIds() {
		return this.reloadedNodeIds;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (ModelTypeHelper.isDefined(this.reloadedAnalyzers)) {
			generator.writeKey("reloaded_analyzers");
			generator.writeStartArray();
			for (String item0 : this.reloadedAnalyzers) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.reloadedNodeIds)) {
			generator.writeKey("reloaded_node_ids");
			generator.writeStartArray();
			for (String item0 : this.reloadedNodeIds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadDetails}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ReloadDetails> {
		private String index;

		private List<String> reloadedAnalyzers;

		private List<String> reloadedNodeIds;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_analyzers}
		 */
		public final Builder reloadedAnalyzers(List<String> value) {
			this.reloadedAnalyzers = value;
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_analyzers}
		 */
		public final Builder reloadedAnalyzers(String... value) {
			this.reloadedAnalyzers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_node_ids}
		 */
		public final Builder reloadedNodeIds(List<String> value) {
			this.reloadedNodeIds = value;
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_node_ids}
		 */
		public final Builder reloadedNodeIds(String... value) {
			this.reloadedNodeIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ReloadDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadDetails build() {
			_checkSingleUse();

			return new ReloadDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReloadDetails}
	 */
	public static final JsonpDeserializer<ReloadDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReloadDetails::setupReloadDetailsDeserializer, Builder::build);

	protected static void setupReloadDetailsDeserializer(DelegatingDeserializer<ReloadDetails.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::reloadedAnalyzers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_analyzers");
		op.add(Builder::reloadedNodeIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_node_ids");

	}

}
