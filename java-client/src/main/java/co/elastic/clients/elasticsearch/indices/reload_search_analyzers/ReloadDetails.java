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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.reload_search_analyzers.ReloadDetails
public final class ReloadDetails implements ToJsonp {
	private final String index;

	private final List<String> reloadedAnalyzers;

	private final List<String> reloadedNodeIds;

	// ---------------------------------------------------------------------------------------------

	protected ReloadDetails(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.reloadedAnalyzers = Objects.requireNonNull(builder.reloadedAnalyzers, "reloaded_analyzers");
		this.reloadedNodeIds = Objects.requireNonNull(builder.reloadedNodeIds, "reloaded_node_ids");

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code reloaded_analyzers}
	 */
	public List<String> reloadedAnalyzers() {
		return this.reloadedAnalyzers;
	}

	/**
	 * API name: {@code reloaded_node_ids}
	 */
	public List<String> reloadedNodeIds() {
		return this.reloadedNodeIds;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("reloaded_analyzers");
		generator.writeStartArray();
		for (String item0 : this.reloadedAnalyzers) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("reloaded_node_ids");
		generator.writeStartArray();
		for (String item0 : this.reloadedNodeIds) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadDetails}.
	 */
	public static class Builder implements ObjectBuilder<ReloadDetails> {
		private String index;

		private List<String> reloadedAnalyzers;

		private List<String> reloadedNodeIds;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code reloaded_analyzers}
		 */
		public Builder reloadedAnalyzers(List<String> value) {
			this.reloadedAnalyzers = value;
			return this;
		}

		/**
		 * API name: {@code reloaded_analyzers}
		 */
		public Builder reloadedAnalyzers(String... value) {
			this.reloadedAnalyzers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #reloadedAnalyzers(List)}, creating the list if needed.
		 */
		public Builder addReloadedAnalyzers(String value) {
			if (this.reloadedAnalyzers == null) {
				this.reloadedAnalyzers = new ArrayList<>();
			}
			this.reloadedAnalyzers.add(value);
			return this;
		}

		/**
		 * API name: {@code reloaded_node_ids}
		 */
		public Builder reloadedNodeIds(List<String> value) {
			this.reloadedNodeIds = value;
			return this;
		}

		/**
		 * API name: {@code reloaded_node_ids}
		 */
		public Builder reloadedNodeIds(String... value) {
			this.reloadedNodeIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #reloadedNodeIds(List)}, creating the list if needed.
		 */
		public Builder addReloadedNodeIds(String value) {
			if (this.reloadedNodeIds == null) {
				this.reloadedNodeIds = new ArrayList<>();
			}
			this.reloadedNodeIds.add(value);
			return this;
		}

		/**
		 * Builds a {@link ReloadDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadDetails build() {

			return new ReloadDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReloadDetails
	 */
	public static final JsonpDeserializer<ReloadDetails> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReloadDetails::setupReloadDetailsDeserializer);

	protected static void setupReloadDetailsDeserializer(DelegatingDeserializer<ReloadDetails.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::reloadedAnalyzers, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_analyzers");
		op.add(Builder::reloadedNodeIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reloaded_node_ids");

	}

}
