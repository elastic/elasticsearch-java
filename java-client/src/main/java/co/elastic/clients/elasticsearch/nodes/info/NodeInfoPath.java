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

package co.elastic.clients.elasticsearch.nodes.info;

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

// typedef: nodes.info.NodeInfoPath
public final class NodeInfoPath implements ToJsonp {
	private final String logs;

	private final String home;

	private final List<String> repo;

	@Nullable
	private final List<String> data;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoPath(Builder builder) {

		this.logs = Objects.requireNonNull(builder.logs, "logs");
		this.home = Objects.requireNonNull(builder.home, "home");
		this.repo = Objects.requireNonNull(builder.repo, "repo");
		this.data = builder.data;

	}

	/**
	 * API name: {@code logs}
	 */
	public String logs() {
		return this.logs;
	}

	/**
	 * API name: {@code home}
	 */
	public String home() {
		return this.home;
	}

	/**
	 * API name: {@code repo}
	 */
	public List<String> repo() {
		return this.repo;
	}

	/**
	 * API name: {@code data}
	 */
	@Nullable
	public List<String> data() {
		return this.data;
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

		generator.writeKey("logs");
		generator.write(this.logs);

		generator.writeKey("home");
		generator.write(this.home);

		generator.writeKey("repo");
		generator.writeStartArray();
		for (String item0 : this.repo) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.data != null) {

			generator.writeKey("data");
			generator.writeStartArray();
			for (String item0 : this.data) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoPath}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoPath> {
		private String logs;

		private String home;

		private List<String> repo;

		@Nullable
		private List<String> data;

		/**
		 * API name: {@code logs}
		 */
		public Builder logs(String value) {
			this.logs = value;
			return this;
		}

		/**
		 * API name: {@code home}
		 */
		public Builder home(String value) {
			this.home = value;
			return this;
		}

		/**
		 * API name: {@code repo}
		 */
		public Builder repo(List<String> value) {
			this.repo = value;
			return this;
		}

		/**
		 * API name: {@code repo}
		 */
		public Builder repo(String... value) {
			this.repo = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #repo(List)}, creating the list if needed.
		 */
		public Builder addRepo(String value) {
			if (this.repo == null) {
				this.repo = new ArrayList<>();
			}
			this.repo.add(value);
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(@Nullable List<String> value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(String... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #data(List)}, creating the list if needed.
		 */
		public Builder addData(String value) {
			if (this.data == null) {
				this.data = new ArrayList<>();
			}
			this.data.add(value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoPath}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoPath build() {

			return new NodeInfoPath(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoPath
	 */
	public static final JsonpDeserializer<NodeInfoPath> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoPath::setupNodeInfoPathDeserializer);

	protected static void setupNodeInfoPathDeserializer(DelegatingDeserializer<NodeInfoPath.Builder> op) {

		op.add(Builder::logs, JsonpDeserializer.stringDeserializer(), "logs");
		op.add(Builder::home, JsonpDeserializer.stringDeserializer(), "home");
		op.add(Builder::repo, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "repo");
		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "data");

	}

}
