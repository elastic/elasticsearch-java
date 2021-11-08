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

// typedef: nodes.info.NodeInfoPath
@JsonpDeserializable
public class NodeInfoPath implements JsonpSerializable {
	private final String logs;

	private final String home;

	private final List<String> repo;

	private final List<String> data;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoPath(Builder builder) {

		this.logs = ModelTypeHelper.requireNonNull(builder.logs, this, "logs");
		this.home = ModelTypeHelper.requireNonNull(builder.home, this, "home");
		this.repo = ModelTypeHelper.unmodifiableRequired(builder.repo, this, "repo");
		this.data = ModelTypeHelper.unmodifiable(builder.data);

	}

	public static NodeInfoPath of(Function<Builder, ObjectBuilder<NodeInfoPath>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code logs}
	 */
	public final String logs() {
		return this.logs;
	}

	/**
	 * Required - API name: {@code home}
	 */
	public final String home() {
		return this.home;
	}

	/**
	 * Required - API name: {@code repo}
	 */
	public final List<String> repo() {
		return this.repo;
	}

	/**
	 * API name: {@code data}
	 */
	public final List<String> data() {
		return this.data;
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

		generator.writeKey("logs");
		generator.write(this.logs);

		generator.writeKey("home");
		generator.write(this.home);

		if (ModelTypeHelper.isDefined(this.repo)) {
			generator.writeKey("repo");
			generator.writeStartArray();
			for (String item0 : this.repo) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.data)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoPath> {
		private String logs;

		private String home;

		private List<String> repo;

		@Nullable
		private List<String> data;

		/**
		 * Required - API name: {@code logs}
		 */
		public final Builder logs(String value) {
			this.logs = value;
			return this;
		}

		/**
		 * Required - API name: {@code home}
		 */
		public final Builder home(String value) {
			this.home = value;
			return this;
		}

		/**
		 * Required - API name: {@code repo}
		 */
		public final Builder repo(List<String> value) {
			this.repo = value;
			return this;
		}

		/**
		 * Required - API name: {@code repo}
		 */
		public final Builder repo(String... value) {
			this.repo = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public final Builder data(@Nullable List<String> value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public final Builder data(String... value) {
			this.data = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoPath}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoPath build() {
			_checkSingleUse();

			return new NodeInfoPath(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoPath}
	 */
	public static final JsonpDeserializer<NodeInfoPath> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoPath::setupNodeInfoPathDeserializer, Builder::build);

	protected static void setupNodeInfoPathDeserializer(DelegatingDeserializer<NodeInfoPath.Builder> op) {

		op.add(Builder::logs, JsonpDeserializer.stringDeserializer(), "logs");
		op.add(Builder::home, JsonpDeserializer.stringDeserializer(), "home");
		op.add(Builder::repo, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "repo");
		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "data");

	}

}
