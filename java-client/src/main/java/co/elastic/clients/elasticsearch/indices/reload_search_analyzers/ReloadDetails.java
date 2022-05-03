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

// typedef: indices.reload_search_analyzers.ReloadDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.reload_search_analyzers.ReloadDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReloadDetails implements JsonpSerializable {
	private final String index;

	private final List<String> reloadedAnalyzers;

	private final List<String> reloadedNodeIds;

	// ---------------------------------------------------------------------------------------------

	private ReloadDetails(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.reloadedAnalyzers = ApiTypeHelper.unmodifiableRequired(builder.reloadedAnalyzers, this,
				"reloadedAnalyzers");
		this.reloadedNodeIds = ApiTypeHelper.unmodifiableRequired(builder.reloadedNodeIds, this, "reloadedNodeIds");

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

		if (ApiTypeHelper.isDefined(this.reloadedAnalyzers)) {
			generator.writeKey("reloaded_analyzers");
			generator.writeStartArray();
			for (String item0 : this.reloadedAnalyzers) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.reloadedNodeIds)) {
			generator.writeKey("reloaded_node_ids");
			generator.writeStartArray();
			for (String item0 : this.reloadedNodeIds) {
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
	 * Builder for {@link ReloadDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReloadDetails> {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>reloadedAnalyzers</code>.
		 */
		public final Builder reloadedAnalyzers(List<String> list) {
			this.reloadedAnalyzers = _listAddAll(this.reloadedAnalyzers, list);
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_analyzers}
		 * <p>
		 * Adds one or more values to <code>reloadedAnalyzers</code>.
		 */
		public final Builder reloadedAnalyzers(String value, String... values) {
			this.reloadedAnalyzers = _listAdd(this.reloadedAnalyzers, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_node_ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>reloadedNodeIds</code>.
		 */
		public final Builder reloadedNodeIds(List<String> list) {
			this.reloadedNodeIds = _listAddAll(this.reloadedNodeIds, list);
			return this;
		}

		/**
		 * Required - API name: {@code reloaded_node_ids}
		 * <p>
		 * Adds one or more values to <code>reloadedNodeIds</code>.
		 */
		public final Builder reloadedNodeIds(String value, String... values) {
			this.reloadedNodeIds = _listAdd(this.reloadedNodeIds, value, values);
			return this;
		}

		@Override
		protected Builder self() {
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
			ReloadDetails::setupReloadDetailsDeserializer);

	protected static void setupReloadDetailsDeserializer(ObjectDeserializer<ReloadDetails.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::reloadedAnalyzers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_analyzers");
		op.add(Builder::reloadedNodeIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_node_ids");

	}

}
